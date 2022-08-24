# LessElytra
Minecraft plugin to disable elytra

Player can hold and wear an elytra, but gliding erases their elytra.
# Usage
To actually allow players to use elytra, the player must be online.
By default, /elytra command is OP-only, you can change it by adding the ```elytra.admin``` permission to the desired player or permission group
> /elytra [username]

All whitelisted player's names are stored inside of a config.yml.

# config.yml
```
warning: §cYou cannot use an elytra
info-on: now can't use an elytra
info-off: now can use an elytra
players:
  - Notch
  - aoimaterasu
```
