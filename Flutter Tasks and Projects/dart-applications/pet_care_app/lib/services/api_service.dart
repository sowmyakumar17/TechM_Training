    Future<List<String>> fetchPets() async {
    await Future.delayed(const Duration(seconds: 2));
    return ['Dog', 'Cat', 'Rabbit'];
    }
