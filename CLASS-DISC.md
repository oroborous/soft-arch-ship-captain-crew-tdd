# Class Discovery

## 1. Find a description of the problem domain
See the README.md file in this project.

## 2. Identify all nouns
- ship
- captain
- crew
- dice game
- players
- round
- player
- score
- turn
- game
- rounds
- scores
- points
- die
- dice
- roll
- rolls
- sum
- face value
- ties
- total score
- winner

## 3. Refine the list of nouns
### 3a. Some nouns mean the same thing
*Score* and *points* refer to the same thing. So do *game* and *dice game*. We decide to keep only *points* and *game*.

Some plural nouns don't have any different meaning from their singular form, like *player*-*players*, *round*-*rounds*, and *score*-*scores*. We'll keep only the singular.

*Roll*-*rolls* is a little different. A *roll* is a player action resulting in a configuration of dice, and *rolls* is a game setting that determines how many times a player may perform that action. We'll keep both nouns, for now.

The same idea applies to *die*-*dice*: one is a game component, the other is a setting that determines how many of these components to create. We'll keep both of these, also.

Remaining nouns:
- ship
- captain
- crew
- ~~dice game~~
- ~~players~~
- round
- player
- ~~score~~
- turn
- game
- ~~rounds~~
- ~~scores~~
- points
- die
- dice
- roll
- rolls
- sum
- face value
- ties
- total score
- winner

### 3b. Nouns we don't need to be concerned with to solve the problem
The concept of a *turn* is already defined by *roll* and *rounds*. A player's *turn* is when they've used all their *rolls* for the *round*. Therefore, we can safely eliminate *turn* as being unnecessary.

Similarly, the idea of a *tie* is captured by *players* having the same *score*. (Or it could be the state of having multiple *winners*.) It's not really a datum in its own right.

Remaining nouns:
- ship
- captain
- crew
- ~~dice game~~
- ~~players~~
- round
- player
- ~~score~~
- ~~turn~~
- game
- ~~rounds~~
- ~~scores~~
- points
- die
- dice
- roll
- rolls
- sum
- face value
- ~~ties~~
- total score
- winner

### 3c. Some nouns represent objects, not classes
*Ship*, *captain*, and *crew* are just dice with particular face values. We don't foresee needing a separate class for each of these.

Remaining nouns:
- ~~ship~~
- ~~captain~~
- ~~crew~~
- ~~dice game~~
- ~~players~~
- round
- player
- ~~score~~
- ~~turn~~
- game
- ~~rounds~~
- ~~scores~~
- points
- die
- dice
- roll
- rolls
- sum
- face value
- ~~ties~~
- total score
- winner

### 3d. Some nouns can be represented with primitive values and don't require their own class
We don't want to write an entire class to represent *points* when an integer will do just as well. Because *sum* is a calculated integer, and we don't want to store calculated values, we'll eliminate it entirely.

Remaining nouns:
- ~~ship~~
- ~~captain~~
- ~~crew~~
- ~~dice game~~
- ~~players~~
- round
- player
- ~~score~~
- ~~turn~~
- game
- ~~rounds~~
- ~~scores~~
- <span style="background-color: yellow; color: black">points</span> integer
- die
- <span style="background-color: yellow; color: black">dice</span> integer
- roll
- <span style="background-color: yellow; color: black">rolls</span> integer
- ~~sum~~
- <span style="background-color: yellow; color: black">face value</span> integer
- ~~ties~~
- <span style="background-color: yellow; color: black">total score</span> integer
- <span style="background-color: yellow; color: black">winner</span> boolean

## 4. Identify class responsibilities
We have identified the following candidate classes. Most of the nouns we marked as being primitive values can become fields in these classes. To put it another way, the class will having the responsibility of **knowing** that information.


| Class  | Responsibilities           |
|--------|----------------------------|
| Round  | - points                   |
| Player | - total score<br/>- winner |
| Game   | - rolls<br/>- dice         |
| Die    | - face value               |
| Roll   |                            |

Before we started our test-driven development, let's assign some behaviors to these classes, as well.

| Class  | Responsibilities                                   |
|--------|----------------------------------------------------|
| Round  | - points<br/>                                      |
| Player | - total score<br/>- winner                         |
| Game   | - rolls<br/>- dice                                 |
| Die    | - face value<br/>- Can be rolled<br/>- Can be held |
| Roll   | - Can reroll unheld dice                           |

This

