# CSC120-FinalProject
## Deliverables:
 - Your final codebase
 - Your revised annotated architecture diagram
 - Design justification (including a brief discussion of at least one alternative you considered)
 - A map of your game's layout (if applicable)
 - `cheatsheet.md`
 - Completed `rubric.md`
  
## Additional Reflection Questions
 - What was your **overall approach** to tackling this project?
 For this project, my overall approach was to break down the game into smaller components and then implement each of them one by one. I started by creating a basic game loop, mapping out the rounds for my game, then the routes, and then added the necessary game mechanics such as challenges and questions for the player. I also made sure to test the game frequently to catch any bugs and take criticism from our last workshop to improve the game.
 - What **new thing(s)** did you learn / figure out in completing this project?
 During the project, I learned how to use Java's built-in libraries to create a simple text-based adventure game. I learned how to use Scanner in a better way than I did in the A3 assignment!
 - Is there anything that you wish you had **implemented differently**?
There are several things that I wish I had implemented differently: 
+ For the players who did not have Love Potion but still wish to go with route 2, I wanted to make them go back and choose a gain instead of throwing a RuntimeException
+ When the player answered the King's question wrong, they will lose all their points and go back to square 1. However, for now, the player only gain 0 points for that round.
+ I wanted the princess' round to have an extra hidden treasure, e.g. when the princess saw that you have Love Potion, she falls in love immediately and tell you the answer to one of the quests in round 3.
 - If you had **unlimited time**, what additional features would you implement?
 + I would definitely implement graphics for the game and make it more object-oriented! I would also add more levels and game modes to the game to make it more engaging for players. 
 - What was the most helpful **piece of feedback** you received while working on your project? Who gave it to you?
The most helpful piece of feedback I received while working on this project was from my peers during the final workshop, who found some minor bugs and advised me on the gameplay of my program. This helped me clean up my code and made it easier to add new features later on.
 - If you could go back in time and give your past self some **advice** about this project, what hints would you give?
 If I could go back in time and give my past self some advice about this project, I would suggest spending more time planning the game mechanics before starting the implementation. This would have helped me avoid some of the design issues I encountered later on.
 - _If you worked with a team:_ please comment on how your **team dynamics** influenced your experience working on this project.
