    import 'package:flutter/material.dart';

    class RequestScreen extends StatefulWidget {
    @override
    _RequestScreenState createState() => _RequestScreenState();
    }

    class _RequestScreenState extends State<RequestScreen> {
    final TextEditingController _requestController = TextEditingController();
    final List<String> _requests = [];

    void _addRequest() {
        if (_requestController.text.isNotEmpty) {
        setState(() {
            _requests.add(_requestController.text);
            _requestController.clear();
        });
        }
    }

    @override
    Widget build(BuildContext context) {
        return Scaffold(
        appBar: AppBar(
            title: Text('Pet Care Requests'),
        ),
        body: Padding(
            padding: const EdgeInsets.all(16.0),
            child: Column(
            children: [
                TextField(
                controller: _requestController,
                decoration: InputDecoration(
                    labelText: 'Enter your request',
                    border: OutlineInputBorder(),
                ),
                ),
                SizedBox(height: 10),
                ElevatedButton(
                onPressed: _addRequest,
                child: Text('Submit Request'),
                ),
                Expanded(
                child: ListView.builder(
                    itemCount: _requests.length,
                    itemBuilder: (context, index) {
                    return Card(
                        child: ListTile(
                        title: Text(_requests[index]),
                        ),
                    );
                    },
                ),
                ),
            ],
            ),
        ),
        );
    }
    }
