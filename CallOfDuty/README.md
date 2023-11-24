# Call of Duty Battle Simulation

This Java program simulates a battle between two groups, a Heist Group and a Police Group, each composed of various members with different weapons and attributes. The battle involves turns, where members from one group attack members from the other until one group is defeated.

## Table of Contents

- [Description](#description)
- [Members and Weapons](#members-and-weapons)
- [Groups](#groups)
- [Battle Simulation](#battle-simulation)
- [Outcome](#outcome)
- [Running the Simulation](#running-the-simulation)

## Description

The program models a battle scenario inspired by the TV series "Money Heist" (La Casa de Papel). It includes different types of characters, such as Heist Members, Heist Mastermind, Police Officers, and Police Inspectors, each equipped with various weapons.

## Members and Weapons

- **Heist Members**: Tokyo, Berlin, Athens, Moscow, Oslo, Minsk, Monaco, Lima, Lisbon, Beirut, Dublin, Nicosia, Kingston
- **Heist Mastermind**: Madrid
- **Insiders**: Insider1, Insider2
- **Police Officers**: po1, po2, po3, po4, po5, po6, po7, po8, po9, po10, po11, po12, po13, po14
- **Police Inspectors**: pi1, pi2

Weapons:
- Rifle, Handgun, Shotgun, Submachine

## Groups

- **Heist Group**: Composed of Heist Members, Heist Mastermind, and Insiders.
- **Police Group**: Composed of Police Officers and Police Inspectors.

## Battle Simulation

The battle simulation involves turns where members from each group attack members from the opposing group. The battle continues until one of the groups is defeated.

## Outcome

After the battle, the program prints information about the surviving members of each group and declares the winner.

## Running the Simulation

To run the simulation, execute the `Battle` class. The program will create instances of Heist and Police groups, simulate the battle, and display the outcome.
