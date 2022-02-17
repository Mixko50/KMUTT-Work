import 'package:flutter/material.dart';

class SoloutionDescribe extends StatelessWidget {
  final String results;
  final String title;
  final String description;

  const SoloutionDescribe(
      {Key? key,
        required this.results,
        required this.title,
        required this.description})
      : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Column(
      children: [
        Row(
          mainAxisAlignment: MainAxisAlignment.spaceEvenly,
          children: [
            Row(
              children: const [
                Icon(
                  Icons.favorite,
                  color: Colors.blue,
                ),
                Icon(Icons.favorite, color: Colors.blue),
                Icon(Icons.favorite, color: Colors.blue),
                Icon(Icons.favorite_border, color: Colors.blue),
                Icon(Icons.favorite_border, color: Colors.blue)
              ],
            ),
            Text(
              results,
              style: const TextStyle(fontSize: 20, fontWeight: FontWeight.w600),
            )
          ],
        ),
        const SizedBox(height: 20,),
        Text(
          title,
          style: const TextStyle(fontSize: 26, fontWeight: FontWeight.w700),
        ),
        const SizedBox(height: 20,),
        Text(description, style: const TextStyle(fontSize: 18),),
        const SizedBox(height: 20,),
        Row(
          mainAxisAlignment: MainAxisAlignment.spaceEvenly,
          children: [
            Column(
              children: const [
                Icon(
                  Icons.schedule,
                  color: Colors.purple,
                ),
                Text(
                  "Time:",
                  style: TextStyle(fontSize: 14, fontWeight: FontWeight.bold, height: 2),
                ),
                Text("250 ms",
                    style:
                    TextStyle(fontSize: 14, fontWeight: FontWeight.bold)),
              ],
            ),
            Column(
              children: const [
                Icon(
                  Icons.search,
                  color: Colors.purple,
                ),
                Text("ITEMS:",
                    style:
                    TextStyle(fontSize: 14, fontWeight: FontWeight.bold, height: 2)),
                Text("10K",
                    style:
                    TextStyle(fontSize: 14, fontWeight: FontWeight.bold)),
              ],
            ),
            Column(
              children: const [
                Icon(
                  Icons.language,
                  color: Colors.purple,
                ),
                Text("MEANING:",
                    style:
                    TextStyle(fontSize: 14, fontWeight: FontWeight.bold, height: 2)),
                Text("2+",
                    style:
                    TextStyle(fontSize: 14, fontWeight: FontWeight.bold,)),
              ],
            )
          ],
        )
      ],
    );
  }
}
