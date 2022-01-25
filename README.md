# Java Project Lvl1
Java Project Lvl1 is a collection of  six CLI games that can be run in your terminal:
- Greet
- Even
- Calc
- GCD
- Progression
- Prime

This project is written with a focus on object-oriented programming. All games have a common base class (the Engine class), so adding a new game is quite simple. I use Gradle as a build automation tool and GitHub Actions as a continuous integration (CI) platform. I also use Make & Makefile for frequently used commands in order to save time.

### Hexlet tests and linter status
[![Actions Status](https://github.com/hopetoknow/java-project-lvl1/workflows/hexlet-check/badge.svg)](https://github.com/hopetoknow/java-project-lvl1/actions)

### GitHub Actions workflow status badge
![Java CI](https://github.com/hopetoknow/java-project-lvl1/actions/workflows/github-actions.yml/badge.svg)

### Maintainability badge from Code Climate
[![Maintainability](https://api.codeclimate.com/v1/badges/5985cc2834edc4acb645/maintainability)](https://codeclimate.com/github/hopetoknow/java-project-lvl1/maintainability)


## Game launch examples
### Greet game

![Greet gif](https://raw.githubusercontent.com/hopetoknow/my-gifs/main/GIFs/Greet.gif)

[Asciinema URL](https://asciinema.org/a/U8sGwJ5YQXfCxOAiQ4mQF7ZCO)

### Even game
![Even gif](https://raw.githubusercontent.com/hopetoknow/my-gifs/main/GIFs/Even.gif)

[Asciinema URL](https://asciinema.org/a/PozgilCH3T9PSoF5wlxJTnHvv)

### Calc game
![Calc gif](https://raw.githubusercontent.com/hopetoknow/my-gifs/main/GIFs/Calc.gif)

[Asciinema URL](https://asciinema.org/a/Z10mdLaZSjG1Nsc3d9dx5epEX)

### GDC game
![GDC gif](https://raw.githubusercontent.com/hopetoknow/my-gifs/main/GIFs/GCD.gif)

[Asciinema URL](https://asciinema.org/a/R1zjBGKTCckrDH2JIr09LL0oa)

### Progression game
![Progression gif](https://raw.githubusercontent.com/hopetoknow/my-gifs/main/GIFs/Progression.gif)

[Asciinema URL](https://asciinema.org/a/A1hAVKXnn6Lb3njr5ZhcxHAEV)

### Prime game
![Prime gif](https://raw.githubusercontent.com/hopetoknow/my-gifs/main/GIFs/Prime.gif)

[Asciinema URL](https://asciinema.org/a/KhDyQmzDV0wfFMAJfXLCxNqb2)

## Install
```sh
make
```

## Run
```sh
make run-dist
```

## Build
```sh
make build
```

## Run checkstyle
```sh
make lint
```

## Check for Dependency Updates
```sh
make check-updates
```
