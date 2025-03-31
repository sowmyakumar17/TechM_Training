    import 'package:flutter/material.dart';
    import 'dart:async';
    import 'home_screen.dart';
    import 'auth_screen.dart';
    import 'package:firebase_auth/firebase_auth.dart';

    class SplashScreen extends StatefulWidget {
    @override
    _SplashScreenState createState() => _SplashScreenState();
    }

    class _SplashScreenState extends State<SplashScreen> {
    @override
    void initState() {
        super.initState();
        Timer(Duration(seconds: 3), () {
        FirebaseAuth.instance.authStateChanges().listen((User? user) {
            if (user == null) {
            Navigator.of(context).pushReplacement(
                MaterialPageRoute(builder: (context) => AuthScreen()),
            );
            } else {
            Navigator.of(context).pushReplacement(
                MaterialPageRoute(builder: (context) => HomeScreen()),
            );
            }
        });
        });
    }

    @override
    Widget build(BuildContext context) {
        return Scaffold(
        backgroundColor: Colors.orange,
        body: Center(
            child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
                Icon(
                Icons.pets,
                size: 100,
                color: Colors.white,
                ),
                SizedBox(height: 20),
                Text(
                'Pet Care App',
                style: TextStyle(
                    fontSize: 24,
                    fontWeight: FontWeight.bold,
                    color: Colors.white,
                ),
                ),
                SizedBox(height: 10),
                CircularProgressIndicator(
                valueColor: AlwaysStoppedAnimation<Color>(Colors.white),
                ),
            ],
            ),
        ),
        );
    }
    }
