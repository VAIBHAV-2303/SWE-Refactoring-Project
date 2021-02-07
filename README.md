# SWE-Project

## Product Overview:
The Bowling Alley simulation application is a software which aims to automate the workflow of
a typical Bowling Alley. It is a fairly complete application in itself as it provides an interface for
a new bowler registration up till the final score-report after a party has ended their game. It
has been developed entirely using Java and some important features of the product are as
follows:

## Feature:

The game simulates several features that add to the overall appeal of the game. Some of the significant features included in the game are :

Control Desk : The control desk operator has the ability to monitor the scores of any active lane. A configurable display option will allow the operator to view the score of an individual scoring station or multiple scoring stations.

Creating a new player : A NewPatron can be created to play the game. This player is then added to the Bolwers database file. The new player will then be eligable to join a party and play a round of the game.

Adding a new party : Selected number of bowlers can be added to a party which is then assigned to one of the free lanes to begin playing a game. In case all the lanes are occupied - the party is then added to the Queue that keeps track of the parties that are registered but yet to play.

Viewing the Pinsetter : For a particular lane, the user can also view the pinsetter window which simulates the pins dropped on each ball-throw. The pinsetter will re-rack the pins (places all ten down) after two consecutive throws have been detected.

Viewing the Scoreboard : The scoreboard keeps track of the score gained by each player in the party after their respective turns. It uses the normal score calculation technique as used in a regular game of bowling - ie for a spare : score = 10 + pins dropped on next ball and for a strike : score = 10 + pins dropped on next 2 balls.

Maintenance Call : This is essentially a simulation of some repair work – ball not returned, pinsetter did not re-rack, etc.– that is to take place for a particular lane. The game play is halted for the time the lane is being repaired.

##### NOTE: in bowler.java put the absolute path of BOWLERS.DAT file. 
