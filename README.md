# Exercise: Refactoring (Java)

### Scenario
- We have a leader board for the biggest pots won in our poker game
- You can ask the leader board for you position in the ranking
- If two players have the same score, i.e. both Alice's and Bob's biggest pot ever was 2000, they have the same rank
- The leader board implementation has some code smells and needs some refactoring, your task is to clean it up
- Luckily there is a solid suite of unit tests that you can run after each change to see if it still works as expected

### Code Dojo
- Do this exercise in a dojo style, i.e. two programmers come to the front and have 2 minutes of time to do some refactorings
- The others can support, giving hints etc.
- After 2 minutes, the next two programmers come to the front and take over

### Hints
- Start with the obvious things first, i.e. first improve the things which are apparent
- While fixing the obvious things, you will get a better understanding and can make further refactorings
- Avoid "big bang" refactorings, often they lead to nowhere and then you have to revert completely and start over
  - A "big bang" refactoring is when the application doesn't work (i.e. unit tests are "red") for a longer time
  - The risk of a "big bang" refactoring is that they are not predictable: as the system doesn't work, you don't know where you are, it is "blind flight" 