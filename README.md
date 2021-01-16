## Exercise: HelloWorld (25 points)

The project name of this exercise is **HelloWorld**.

This is your first assignment and this assignment's purpose is to give you some practice using the tools that we will use all semester. This exercise should help you adapt to the class' _workflow_.

### Getting Started

The first thing you will need to do is accept the invitation to this assignment
from GitHub Classroom. You can click [here](https://classroom.github.com/a/LcUVFCqC) to accept the invitation, and get started. 

Be sure that you accept the invitation first and use the URL to your new project when you clone it in CLion. After copying
the URL into the clipboard, in CLion click **VCS -> Checkout from Version Control -> Git**. Paste the URL into the **URL** box of the _Clone Repository_ dialog box and press **Clone**.

### Writing the code for this Project

Like our last exercise, we are going to start by creating a Java class. The file for this project is called **HelloWorld.java**. In the Project view, click the trianble next to the project name, then `src`, then `main`, then right-click on `java` select `New -> Java Class` to create a class called **edu.vcccd.vc.csv40.HelloWorld**.

That lass action will create a file named **HelloWorld.java**. This file is where your source code will go. Replace the code in that file with the code in the grey box below:

```java
package edu.vcccd.vc.csv40;

/**
 * CS V40 Beginning Java
 * Assignment: HelloWorld
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 *
 * @author [CHANGE THIS TO YOUR INFORMATION]
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```  

Now go through **HelloWorld.java** and change the [CHANGE THIS TO YOUR INFORMATION] text to your name and email address.

### Running the code for this project

Next, write your code that prints a string to the console with the computed letter size in `public static void main` between the curly braces. The program should first output a prompt to ask the user for a number. The output could look something like:

```bash
> Task :run
Hello, World!

BUILD SUCCESSFUL in 1s
2 actionable tasks: 2 executed
10:54:33 AM: Task execution finished 'run'.
```

Once you've written your code, run it by selected the **EX01-HelloWorld [run]** in the target drop-down box and the pressing the play button. Examine the output. Does it do what you want? If not, how can you modify the code to do what you want?

Next, make sure it also passes the Unit tests. To run the Unit tests select the **EX01-HelloWorld [test]** target and press the play button. The output to the console should look somethink like:

```bash
Testing started at 10:55 AM ...
> Task :wrapper
BUILD SUCCESSFUL in 0s
1 actionable task: 1 executed
> Task :compileJava UP-TO-DATE
> Task :processResources NO-SOURCE
> Task :classes UP-TO-DATE
> Task :compileTestJava UP-TO-DATE
> Task :processTestResources NO-SOURCE
> Task :testClasses UP-TO-DATE
> Task :test
Your unit test score is 20 out of 20.

The assignment is worth a total of 25 where the remainder of 5 points
comes from grading related to documentation, algorithms, and other
criteria.
BUILD SUCCESSFUL in 1s
3 actionable tasks: 1 executed, 2 up-to-date
10:55:29 AM: Task execution finished 'test'.

```

### How to turn in this exercise

### Pushing your code to GitHub

Now you need to turn in your code by sending, or pushing, your code to GitHub. You created a 
GitHub repository when you started the assignment. Now you need to take your local code changes
and send them to GitHub so that you can turn it in and have it graded in the next step in the
work flow.

The first step is to commit your code locally. This tell git what files you want to turn in. In 
this case you only need to turn in the contents of `hello_world.py`. In the Project view, right-
click **EX01-HelloWorld** and then select **Git -> Commit Directory...**. In the dialog box that
pops up, be sure only `hello_world.py` is selected and that there is some text in the _Commit 
Message_ box. A good commit message would be something like `Committing code to get a good grade`.
Select the arrow next to **Commit** button, and select **Commit and Push**.

Once the commit is finished, which is a purely local action, you may need to send that commit to 
GitHub, if you selected **Commit** instead of **Commit and Push**. This is called the push phase 
of the process. Again right-click on **EX01-HelloWorld**. Then select **Git -> Repository -> Push**. 
In the dialog box that pops up, push the **Push** button and that should be it. You should see a 
message that says the push was successful. In the next step you'll confirm that your code is 
working and then submit it for a grade.

### Turning in and Grading your code

Go back to LazyGrader and login again, if needed. Press the _Build_ button next to 
**EX01-HelloWorld** for this course. This will send a command to Jenkins to download your code
from GitHub and test it. If all goes well and all the tests pass, the ball next to the _Build_
will turn blue. If some of the tests don't pass the ball will be yellow. If the ball is grey,
that means you have not run the tests before and your project is not ready for grading.

Once the Jenkins status is blue or yellow, press the _Grade_ button for **EX01-HelloWorld**.
This will read the results from Jenkins and send your grade to Canvas. Once the notification in 
LazyGrader says the grade has been posted, you should see your grade on Canvas.

That's it, once you've submitted your grade, you are done. I will add points later, after I
inspect your code. For example, most projects will be out of a total of 25 points, but after 
pressing the _Grade_ button, Canvas will show 20 points. I will add up to 5 points after I have
looked at your code and am conviced it is original.

 
