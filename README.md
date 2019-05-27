# Exercise: Refactoring (Java)

- Do this exercise in a dojo style, i.e. two programmers come to the front and have 2 minutes of time to do some refactorings
- The others can support, giving hints etc.
- After 2 minutes, the next two programmers come to the front and take over

### Scenario
- We have a leader board for the biggest pots won in our poker game
- You can ask the leader board for you position in the ranking
- If two players have the same score, i.e. both Alice's and Bob's biggest pot ever was 2000, they have the same rank
- The leader board implementation has some code smells and needs some refactoring, your task is to clean it up
- Luckily there is a solid suite of unit tests that you can run after each change to see if it still works as expected

### Hints
- Start with the obvious things first, i.e. first improve the things which are apparent
- While fixing the obvious things, you will get a better understanding and can make further refactorings
- Avoid "big bang" refactorings, often they lead to nowhere and then you have to revert completely and start over
  - A "big bang" refactoring is when the application doesn't work (i.e. unit tests are "red") for a longer time
  - The risk of a "big bang" refactoring is that they are not predictable: as the system doesn't work, you don't know where you are, it is "blind flight"
  
## Test support tools
- To continuously execute your tests you can use [Infinitest](http://infinitest.github.io/) which has plugins for Eclipse and IntelliJ
- To get code coverage statistics you can use:
	- IntelliJ's built-in [code coverage runner](https://www.jetbrains.com/help/idea/code-coverage.html)
	- [EclEmma](https://www.eclemma.org/) plugin for Eclipse
- Mutation tests are available using the PIT maven plugin.
	- Simply run `mvn org.pitest:pitest-maven:mutationCoverage` the report will be available at **target/pit-reports/{timestamp}/index.html**
	- NOTE: If pitest reports any problems you can try to run `mvn install` and then retry. 