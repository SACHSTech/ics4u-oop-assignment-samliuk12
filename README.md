[![Work in Repl.it](https://classroom.github.com/assets/work-in-replit-14baed9a392b3a25080506f3b7b6d57f295ec2978f6f33ec97e36a161684cbe9.svg)](https://classroom.github.com/online_ide?assignment_repo_id=3826717&assignment_repo_type=AssignmentRepo)
# ICS4U OOP Assignment

<img src="https://github.com/SACHSTech/ics4u-oop-assignment-samliuk12/blob/main/Class%20diagram.png?raw=true">

## Summary
The Pokemon universe can be divided into two main components: the people and the Pokemon. Immediately, we spot an aggregate or have-A relationship, as people often own or *have* Pokemon. This relationship is demonstrated in the *pokemonList* and *activePokemon* instance variables of the *Person* class. If we further examine the people in the Pokemon world, we see that we can further subdivide the *Person* class into *Trainer* and *GymOwner* subclasses. Each of these child classes inherits variables and methods such as *name*, *age*, and *activePokemon* from the parent class, but each child class has its own unique properties. For example, the *Trainer* class has a method called *catchPokemon()*, which is unique to trainers as gym owners don’t typically catch Pokemon. Lastly, we spot another aggregate relationship between *GymOwner* and *GymLocation*, as gym locations are too complex to describe with a single variable and are represented by a class. 
