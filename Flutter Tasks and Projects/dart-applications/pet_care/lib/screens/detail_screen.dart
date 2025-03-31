    import 'package:flutter/material.dart';
    import 'package:cloud_firestore/cloud_firestore.dart';
    import 'package:cached_network_image/cached_network_image.dart';

    class DetailScreen extends StatelessWidget {
    final String petId;

    const DetailScreen({super.key, required this.petId});

    @override
    Widget build(BuildContext context) {
        return Scaffold(
        appBar: AppBar(
            title: const Text("Pet Details"),
            backgroundColor: Colors.orange,
        ),
        body: FutureBuilder<DocumentSnapshot>(
            future: FirebaseFirestore.instance.collection('pets').doc(petId).get(),
            builder: (context, snapshot) {
            if (snapshot.connectionState == ConnectionState.waiting) {
                return const Center(child: CircularProgressIndicator());
            }

            if (!snapshot.hasData || !snapshot.data!.exists) {
                return const Center(child: Text("Pet not found"));
            }

            var petData = snapshot.data!.data() as Map<String, dynamic>;

            return SingleChildScrollView(
                padding: const EdgeInsets.all(16.0),
                child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                    ClipRRect(
                    borderRadius: BorderRadius.circular(16.0),
                    child: CachedNetworkImage(
                        imageUrl: petData['imageUrl'] ?? '',
                        height: 250,
                        width: double.infinity,
                        fit: BoxFit.cover,
                        placeholder: (context, url) =>
                            const Center(child: CircularProgressIndicator()),
                        errorWidget: (context, url, error) =>
                            const Icon(Icons.error, size: 100, color: Colors.red),
                    ),
                    ),
                    const SizedBox(height: 20),
                    Text(
                    petData['name'] ?? 'Unknown Pet',
                    style: const TextStyle(
                        fontSize: 24,
                        fontWeight: FontWeight.bold,
                    ),
                    ),
                    const SizedBox(height: 10),
                    Text(
                    "Breed: ${petData['breed'] ?? 'Not specified'}",
                    style: const TextStyle(fontSize: 18),
                    ),
                    const SizedBox(height: 10),
                    Text(
                    "Age: ${petData['age'] ?? 'Not specified'} years",
                    style: const TextStyle(fontSize: 18),
                    ),
                    const SizedBox(height: 10),
                    Text(
                    "Owner: ${petData['ownerName'] ?? 'Unknown'}",
                    style: const TextStyle(
                        fontSize: 16,
                        fontStyle: FontStyle.italic,
                    ),
                    ),
                    const SizedBox(height: 15),
                    Text(
                    petData['description'] ?? 'No description available.',
                    style: const TextStyle(fontSize: 16),
                    ),
                ],
                ),
            );
            },
        ),
        );
    }
    }
