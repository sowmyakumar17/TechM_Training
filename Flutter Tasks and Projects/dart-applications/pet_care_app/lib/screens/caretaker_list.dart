    import 'package:flutter/material.dart';
    import '../services/firebase_service.dart';

    class CaretakerList extends StatelessWidget {
    const CaretakerList({super.key});

    @override
    Widget build(BuildContext context) {
        return Scaffold(
        appBar: AppBar(title: const Text('Caretaker Details')),
        body: StreamBuilder(
            stream: fetchCaretakers(),
            builder: (context, snapshot) {
            if (!snapshot.hasData) {
                return const Center(child: CircularProgressIndicator());
            }
            final caretakers = snapshot.data!.docs;
            return ListView.builder(
                itemCount: caretakers.length,
                itemBuilder: (context, index) {
                return ListTile(
                    title: Text(caretakers[index]['name']),
                    subtitle: Text(caretakers[index]['contact']),
                );
                },
            );
            },
        ),
        );
    }
    }