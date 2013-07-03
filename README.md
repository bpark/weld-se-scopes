weld-se-scopes
=============

Demonstration of custom scopes for a weld-se application.

To run the demonstration you need

    * jdk 7
    * maven 2 or maven 3

To run the example run ApplicationStarter.

Output :

com.github.bpark.MyService@1f680ea
com.github.bpark.MyService@899e53
com.github.bpark.MyService@f98160

As you can see, each ServiceLooper.callService() uses its own
MyService instance.