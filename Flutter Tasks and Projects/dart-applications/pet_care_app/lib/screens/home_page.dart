    import 'package:flutter/material.dart';
    import '../widgets/pet_list.dart';
    import 'application_form.dart';
    import 'caretaker_list.dart';
    import 'package:easy_localization/easy_localization.dart';


    class HomePage extends StatelessWidget {
    const HomePage({super.key});

    @override
    Widget build(BuildContext context) {
        return Scaffold(
        appBar: AppBar(title: Text('title'.tr())),
        body: Column(
            children: [
            Expanded(child: PetList()),
            ElevatedButton(
                onPressed: () {
                Navigator.push(
                    context,
                    MaterialPageRoute(builder: (context) => const ApplicationForm()),
                );
                },
                child: const Text('Apply for Pet Care'),
            ),
            ElevatedButton(
                onPressed: () {
                Navigator.push(
                    context,
                    MaterialPageRoute(builder: (context) => const CaretakerList()),
                );
                },
                child: Text('apply_button'.tr()),
            ),
            ],
        ),
        );
    }
    }
