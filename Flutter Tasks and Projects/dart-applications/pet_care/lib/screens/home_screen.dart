    import 'package:flutter/material.dart';
    import 'package:cloud_firestore/cloud_firestore.dart';

    class HomeScreen extends StatelessWidget {
    @override
    Widget build(BuildContext context) {
        return Scaffold(
        appBar: AppBar(
            title: Text('Home'),
            backgroundColor: Colors.orange,
        ),
        body: StreamBuilder(
            stream: FirebaseFirestore.instance.collection('pets').snapshots(),
            builder: (ctx, AsyncSnapshot<QuerySnapshot> snapshot) {
            if (snapshot.connectionState == ConnectionState.waiting) {
                return Center(child: CircularProgressIndicator());
            }
            if (!snapshot.hasData || snapshot.data!.docs.isEmpty) {
                return Center(child: Text('No pets available'));
            }
            final pets = snapshot.data!.docs;
            return ListView.builder(
                itemCount: pets.length,
                itemBuilder: (ctx, index) {
                var pet = pets[index];
                return Card(
                    margin: EdgeInsets.all(10),
                    child: ListTile(
                    leading: pet['imageUrl'] != null
                        ? Image.network(pet['imageUrl'], width: 50, height: 50, fit: BoxFit.cover)
                        : Icon(Icons.pets, size: 50),
                    title: Text(pet['name'] ?? 'Unknown Pet'),
                    subtitle: Text(pet['breed'] ?? 'Unknown Breed'),
                    trailing: Icon(Icons.arrow_forward_ios),
                    onTap: () {
                        // Navigate to pet details screen
                    },
                    ),
                );
                },
            );
            },
        ),
        floatingActionButton: FloatingActionButton(
            backgroundColor: Colors.orange,
            child: Icon(Icons.add),
            onPressed: () {
            Navigator.pushNamed(context, '/create_pet_post');
            },
        ),
        );
    }
    }