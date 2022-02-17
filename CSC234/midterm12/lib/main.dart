import 'package:flutter/material.dart';
import 'package:midterm12/widgets/solutionDescribe.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: MyHomePage(title: 'What is the solution?'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  MyHomePage({Key? key, required this.title}) : super(key: key);

  final String title;

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  bool pic = true;
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: Text(widget.title),
        ),
        body: Padding(
          padding: const EdgeInsets.all(20.0),
          child: Column(
            children: [
              const SoloutionDescribe(results: "10K results",title: "Solutions mean",description: "1. A mean of solving a problem or dealing with a difficult solution \n2. A liquid mixture in which the minor component (the solute) is uniformly distributed within the major component (the solvent)."),Padding(
                padding: const EdgeInsets.all(12.0),
                child: InkWell(child: Image.asset(pic ? "images/capture.PNG" : "images/capturescr.PNG"), onTap: () {
                  setState(() {
                    pic = !pic;
                  });
                },),
              )
            ],
          ),
        )
    );
  }
}
