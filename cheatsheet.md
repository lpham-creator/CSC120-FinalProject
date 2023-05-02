## Game Class Cheatsheet
### Attributes
- **POINTS_TO_WIN**: the number of points required to win the game
- **QUESTIONS_PER_ROUND**: the number of questions per round
- **player**: the Player object representing the player playing the game
- **pointsForRound1**: the number of points the player has earned in round 1
- **pointsForRound2**: the number of points the player has earned in round 2
- **pointsForRound3**: the number of points the player has earned in round 3
### Methods
- **public Game()**: Constructor that creates a new Game object and a Player object, and resets the points for each round to 0.
- **public void start()**: Method that starts the game with all 3 rounds.

## King Class Cheatsheet
### Attributes
- **questions**: the hashtable of questions for the King to choose from
- **rand**: a random object that is used to pick a random question from the pool
### Methods
- **getQuestion()**: Gets a random question from the questions Hashtable.
- **askQuestion()**: Asks the question and checks if the answers match.

## Player Class Cheatsheet
### Attributes
- **name**: the name of the player (player will be prompted to enter their name via a Scanner object)
- **age**: the age of the player (player will be prompted to enter their age via a Scanner object)
- **totalPoints**: the player's total points
- **item**: the player's array list of itens
### Methods
- **getTotalPoints()**: return the total points of the player
- **containItems()**: return a boolean indicating if the player has the item
- **addItems()**: add an item 
- **removeItem()**: remove an item from the player's list

## Collectibles Class Cheatsheet
### Attributes
- **items**: a hashtable used to store the items and their corresponding point values
- **rand**: random object to randomly pick an item for the traveller
### Methods
- **getItemValue()**: A method which gets the value of the item
- **getRandomItem()**: A method which returns a random item from the collectibles

# SPOILER ALERT: Fastest way to win the game :-)
Firstly, the game will promt you to enter your name and age. After that, you will experience three rounds of gameplay, and the game will mostly be Q&A. The goal is to gain 500 points or over to win the game.

*Round 1: Deadly Dessert*

For this round, if you want to go through the game ASAP, just choose Quest 1 or Quest 2, as you will surely gain 100 points from these quests. Quest 3 is for players who want to try their luck. Quest 3 also has an undo mechanical: if you don't like the item you found, you can throw it away. There's a hidden treasure: if you choose quest 3 and find a **Love Potion**, you can automatically pass round 2 without having to answer the King's question, so don't throw that away!

*Round 2: Lake of Love*

This round has two Quests: Answer the King's question or catsitting for the Princess, however, the latter's only available to players who has Love Potion. Choose Quest 1 if you don't have the item. Here are the answers to all available questions:

- What is the capital of France? Paris
- What is the highest mountain in the world? Mount Everest
- What is the largest mammal in the world? Blue Whale

If you choose catsitting for the Princess, you automatically pass this round with 300 points!

*Round 3: Ice Land*

This round has 2 quests: Arts and Science. Here are the answers to the 2 Quests:

- Science: 180
- Arts: Surrealism

If you do everything right, you should win the game with 500 points or more ! :-)

