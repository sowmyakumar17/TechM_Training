    class CustomButton extends StatelessWidget {
    final String text;
    final VoidCallback onPressed;

    CustomButton({required this.text, required this.onPressed});

    @override
    Widget build(BuildContext context) {
        return ElevatedButton(
        style: ElevatedButton.styleFrom(
            backgroundColor: Colors.orange,
            padding: EdgeInsets.symmetric(horizontal: 20, vertical: 10),
        ),
        onPressed: onPressed,
        child: Text(text, style: TextStyle(color: Colors.white)),
        );
    }
    }