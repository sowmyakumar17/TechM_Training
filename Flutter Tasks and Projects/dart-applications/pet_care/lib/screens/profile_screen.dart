    import 'package:flutter/material.dart';
    import 'package:firebase_auth/firebase_auth.dart';
    import 'package:cloud_firestore/cloud_firestore.dart';

    class ProfileScreen extends StatelessWidget {
    @override
    Widget build(BuildContext context) {
        final User? user = FirebaseAuth.instance.currentUser;

        return Scaffold(
        appBar: AppBar(
            title: Text('Profile'),
            actions: [
            IconButton(
                icon: Icon(Icons.logout),
                onPressed: () async {
                await FirebaseAuth.instance.signOut();
                Navigator.of(context).pushReplacementNamed('/auth');
                },
            ),
            ],
        ),
        body: FutureBuilder<DocumentSnapshot>(
            future: FirebaseFirestore.instance.collection('users').doc(user?.uid).get(),
            builder: (context, snapshot) {
            if (snapshot.connectionState == ConnectionState.waiting) {
                return Center(child: CircularProgressIndicator());
            }
            if (!snapshot.hasData || snapshot.data == null) {
                return Center(child: Text('No user data found.'));
            }
            var userData = snapshot.data!.data() as Map<String, dynamic>;
            return Padding(
                padding: EdgeInsets.all(16.0),
                child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                    Center(
                    child: CircleAvatar(
                        radius: 50,
                        backgroundImage: NetworkImage(userData['imageUrl'] ?? ''),
                    ),
                    ),
                    SizedBox(height: 20),
                    Text('Name: ${userData['name']}', style: TextStyle(fontSize: 18)),
                    SizedBox(height: 10),
                    Text('Email: ${user?.email}', style: TextStyle(fontSize: 18)),
                    SizedBox(height: 10),
                    Text('Phone: ${userData['phone']}', style: TextStyle(fontSize: 18)),
                ],
                ),
            );
            },
        ),
        );
    }
    }