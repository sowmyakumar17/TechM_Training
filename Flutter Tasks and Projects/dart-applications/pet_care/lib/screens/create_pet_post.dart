    import 'package:cloud_firestore/cloud_firestore.dart';
    import 'package:firebase_auth/firebase_auth.dart';
    import 'package:flutter/material.dart';

    class CreatePetPostScreen extends StatefulWidget {
    const CreatePetPostScreen({super.key});

    @override
    _CreatePetPostScreenState createState() => _CreatePetPostScreenState();
    }

    class _CreatePetPostScreenState extends State<CreatePetPostScreen> {
    final TextEditingController _nameController = TextEditingController();
    final TextEditingController _descriptionController = TextEditingController();
    final TextEditingController _imageUrlController = TextEditingController();
    
    bool isLoading = false;

    Future<void> _submitPost() async {
        if (_nameController.text.isEmpty || _descriptionController.text.isEmpty || _imageUrlController.text.isEmpty) {
        ScaffoldMessenger.of(context).showSnackBar(
            const SnackBar(content: Text("All fields are required")),
        );
        return;
        }

        setState(() {
        isLoading = true;
        });

        try {
        final user = FirebaseAuth.instance.currentUser;
        if (user != null) {
            await FirebaseFirestore.instance.collection('pet_posts').add({
            'name': _nameController.text.trim(),
            'description': _descriptionController.text.trim(),
            'imageUrl': _imageUrlController.text.trim(),
            'userId': user.uid,
            'createdAt': Timestamp.now(),
            });

            ScaffoldMessenger.of(context).showSnackBar(
            const SnackBar(content: Text("Pet post added successfully!")),
            );

            Navigator.pop(context);
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
        appBar: AppBar(title: const Text("Create Pet Post")),
        body: Padding(
            padding: const EdgeInsets.all(20.0),
            child: Column(
            children: [
                TextField(
                controller: _nameController,
                decoration: const InputDecoration(labelText: "Pet Name"),
                ),
                TextField(
                controller: _descriptionController,
                decoration: const InputDecoration(labelText: "Description"),
                maxLines: 3,
                ),
                TextField(
                controller: _imageUrlController,
                decoration: const InputDecoration(labelText: "Image URL"),
                ),
                const SizedBox(height: 20),
                isLoading
                    ? const CircularProgressIndicator()
                    : ElevatedButton(
                        onPressed: _submitPost,
                        style: ElevatedButton.styleFrom(
                        backgroundColor: Colors.orange,
                        padding: const EdgeInsets.symmetric(
                            horizontal: 40, vertical: 12),
                        ),
                        child: const Text("Post"),
                    ),
            ],
            ),
        ),
        );
    }
    }
