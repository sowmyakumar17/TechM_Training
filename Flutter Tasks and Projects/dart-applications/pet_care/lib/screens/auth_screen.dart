    import 'package:firebase_auth/firebase_auth.dart';
    import 'package:flutter/material.dart';
    import 'package:cloud_firestore/cloud_firestore.dart';
    import 'home_screen.dart';

    class AuthScreen extends StatefulWidget {
    const AuthScreen({super.key});

    @override
    _AuthScreenState createState() => _AuthScreenState();
    }

    class _AuthScreenState extends State<AuthScreen> {
    final FirebaseAuth _auth = FirebaseAuth.instance;
    final FirebaseFirestore _firestore = FirebaseFirestore.instance;

    final TextEditingController _emailController = TextEditingController();
    final TextEditingController _passwordController = TextEditingController();
    final TextEditingController _nameController = TextEditingController();

    bool isLogin = true;
    bool isLoading = false;

    // Toggle between Login & Signup
    void _toggleAuthMode() {
        setState(() {
        isLogin = !isLogin;
        });
    }

    // Function to handle authentication
    Future<void> _authenticate() async {
        setState(() {
        isLoading = true;
        });

        try {
        UserCredential userCredential;
        if (isLogin) {
            // Login User
            userCredential = await _auth.signInWithEmailAndPassword(
            email: _emailController.text.trim(),
            password: _passwordController.text.trim(),
            );
        } else {
            // Register User
            userCredential = await _auth.createUserWithEmailAndPassword(
            email: _emailController.text.trim(),
            password: _passwordController.text.trim(),
            );

            // Store user data in Firestore
            await _firestore.collection('users').doc(userCredential.user!.uid).set({
            'name': _nameController.text.trim(),
            'email': _emailController.text.trim(),
            });
        }

        // Navigate to Home Screen after authentication
        if (userCredential.user != null) {
            Navigator.pushReplacement(
            context,
            MaterialPageRoute(builder: (context) => const HomeScreen()),
            );
        }
        } catch (e) {
        ScaffoldMessenger.of(context).showSnackBar(
            SnackBar(content: Text("Error: ${e.toString()}")),
        );
        }

        setState(() {
        isLoading = false;
        });
    }

    @override
    Widget build(BuildContext context) {
        return Scaffold(
        body: Padding(
            padding: const EdgeInsets.all(20.0),
            child: Center(
            child: SingleChildScrollView(
                child: Column(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                    const Text(
                    "Pet Care App",
                    style: TextStyle(fontSize: 24, fontWeight: FontWeight.bold),
                    ),
                    const SizedBox(height: 20),

                    // Name Field (Only for Signup)
                    if (!isLogin)
                    TextField(
                        controller: _nameController,
                        decoration: InputDecoration(
                        labelText: "Full Name",
                        border: OutlineInputBorder(
                            borderRadius: BorderRadius.circular(10)),
                        ),
                    ),

                    const SizedBox(height: 10),

                    // Email Field
                    TextField(
                    controller: _emailController,
                    decoration: InputDecoration(
                        labelText: "Email",
                        border: OutlineInputBorder(
                            borderRadius: BorderRadius.circular(10)),
                    ),
                    ),

                    const SizedBox(height: 10),

                    // Password Field
                    TextField(
                    controller: _passwordController,
                    decoration: InputDecoration(
                        labelText: "Password",
                        border: OutlineInputBorder(
                            borderRadius: BorderRadius.circular(10)),
                    ),
                    obscureText: true,
                    ),

                    const SizedBox(height: 20),

                    // Login/Register Button
                    isLoading
                        ? const CircularProgressIndicator()
                        : ElevatedButton(
                            onPressed: _authenticate,
                            style: ElevatedButton.styleFrom(
                            backgroundColor: Colors.orange,
                            padding: const EdgeInsets.symmetric(
                                horizontal: 40, vertical: 12),
                            ),
                            child: Text(
                            isLogin ? "Login" : "Register",
                            style: const TextStyle(color: Colors.white),
                            ),
                        ),

                    const SizedBox(height: 10),

                    // Switch between Login & Register
                    TextButton(
                    onPressed: _toggleAuthMode,
                    child: Text(
                        isLogin
                            ? "Don't have an account? Register"
                            : "Already have an account? Login",
                        style: const TextStyle(color: Colors.blue),
                    ),
                    ),
                ],
                ),
            ),
            ),
        ),
        );
    }
    }
