    import 'package:flutter/material.dart';
    import '../services/db_service.dart';

    class ApplicationForm extends StatefulWidget {
    const ApplicationForm({super.key});

    @override
    _ApplicationFormState createState() => _ApplicationFormState();
    }

    class _ApplicationFormState extends State<ApplicationForm> {
    final _formKey = GlobalKey<FormState>();
    final _nameController = TextEditingController();

    @override
    Widget build(BuildContext context) {
        return Scaffold(
        appBar: AppBar(title: const Text('Application Form')),
        body: Form(
            key: _formKey,
            child: Column(
            children: [
                TextFormField(
                controller: _nameController,
                decoration: const InputDecoration(labelText: 'Your Name'),
                validator: (value) => value!.isEmpty ? 'Required' : null,
                ),
                ElevatedButton(
                onPressed: () {
                    if (_formKey.currentState!.validate()) {
                    saveApplication(_nameController.text);
                    }
                },
                child: const Text('Submit'),
                ),
            ],
            ),
        ),
        );
    }
    }