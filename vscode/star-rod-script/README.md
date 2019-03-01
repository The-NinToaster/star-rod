<p align="center"><img src="https://raw.githubusercontent.com/gregdegruy/star-rod/master/img/star-rod-pm64.png" width="64"></p>

# Star Rod Script VS Code Language Extension

This repo contributes a definition of a new language enriching the knowledge VS Code has about Star Rod.

## Features
* Star Rod Script syntax highlighting.
* Port of the [Sublime version](https://github.com/nanaian/sublime-star-rod) using this [doc](https://code.visualstudio.com/api/language-extensions/syntax-highlight-guide#converting-an-existing-textmate-grammar).

## Requirements
* [VS Code](https://code.visualstudio.com/Download)
* [Star Rod](http://origami64.net/showthread.php?tid=789)

## Extension Settings
This extension contributes:
* [Grammars](https://code.visualstudio.com/api/references/contribution-points#contributes.grammars)
* [Languages](https://code.visualstudio.com/api/references/contribution-points#contributes.languages)

## Known Issues
* [Converting an existing TextMate grammar](https://code.visualstudio.com/api/language-extensions/syntax-highlight-guide#converting-an-existing-textmate-grammar) works for the [sublime version](https://github.com/nanaian/sublime-star-rod), but maintains the source xml and if converted to json does not maintain a one to one mapping to the expected json format detailed in [contributing a basic grammar](https://code.visualstudio.com/api/language-extensions/syntax-highlight-guide#contributing-a-basic-grammar).

* For environment setup in extension development if you run across this working with the Linux subsystem `/mnt/c/Program Files/nodejs/npm: Syntax error: word unexpected (expecting "in")` use this [solution](https://github.com/Microsoft/WSL/issues/1512).

## Release Notes

### 0.0.3

Ported control and operator patterns.

### 0.0.1

Environment setup.
