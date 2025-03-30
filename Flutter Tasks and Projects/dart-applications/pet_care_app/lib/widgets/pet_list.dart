    import 'package:flutter/material.dart';
    import '../services/api_service.dart';
    import 'package:flutter/services.dart';

    void checkAssetExistence() async {
    try {
        await rootBundle.load('assets/images/pet_dog.png');
        print('✅ Asset exists and is loading correctly!');
    } catch (e) {
        print('❌ Error: Asset does not exist or cannot be loaded.');
    }
    }

    @override
    Widget build(BuildContext context) {
    checkAssetExistence(); // Call it here for debugging
    return FutureBuilder(
        future: fetchPets(),
        builder: (context, snapshot) {
        if (snapshot.connectionState == ConnectionState.waiting) {
            return const CircularProgressIndicator();
        } else if (snapshot.hasError) {
            return const Text('Error fetching data');
        } else {
            final pets = snapshot.data as List<String>;
            List<String> petImages = [
            'assets/images/pet_dog.png',
            'assets/images/pet_cat.png'
            ];
            return ListView.builder(
            itemCount: pets.length,
            itemBuilder: (context, index) => ListTile(
                leading: Image.asset(
                petImages[index % petImages.length],
                width: 50,
                errorBuilder: (context, error, stackTrace) =>
                    const Icon(Icons.error), // Show error icon if asset fails
                ),
                title: Text(pets[index]),
            ),
            );
        }
        },
    );
    }
