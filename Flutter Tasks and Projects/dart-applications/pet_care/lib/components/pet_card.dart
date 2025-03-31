    class PetCard extends StatelessWidget {
    final String petName;
    final String imageUrl;
    final String description;

    PetCard({required this.petName, required this.imageUrl, required this.description});

    @override
    Widget build(BuildContext context) {
        return Card(
        shape: RoundedRectangleBorder(
            borderRadius: BorderRadius.circular(15),
        ),
        elevation: 5,
        child: Column(
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [
            ClipRRect(
                borderRadius: BorderRadius.vertical(top: Radius.circular(15)),
                child: Image.network(imageUrl, height: 150, width: double.infinity, fit: BoxFit.cover),
            ),
            Padding(
                padding: EdgeInsets.all(10),
                child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                    Text(petName, style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold)),
                    SizedBox(height: 5),
                    Text(description, style: TextStyle(fontSize: 14, color: Colors.grey)),
                ],
                ),
            ),
            ],
        ),
        );
    }
    }
