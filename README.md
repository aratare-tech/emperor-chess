# Emperor Chess
Emperor Chess is a King Chess game created for King Chess lovers who crave for a bit more. It incorporates all the good things about King Chess but also adds more mechanics for extra flavour.

If you're a master at chess game and you're thinking "how boring", don't underestimate this game. It was created to bring extra ~~brain pressure~~ fun, because ~~brain pressure~~ **fun is mandatory**.

If you're a newbie at chess game and you're thinking "how difficult", it's not. Again, it's created for ~~brain pressure~~ fun.

Whoever you are, try it! And perhaps love it!

- [Emperor Chess](#emperor-chess)
- [Rules](#rules)
  - [Stats](#stats)
    - [Food](#food)
    - [Attack Point (AP)](#attack-point-ap)
    - [Influence Point (IP)](#influence-point-ip)
  - [Turn](#turn)
  - [Specialisation](#specialisation)
  - [Supply](#supply)
  - [Special Abilities](#special-abilities)

# Rules
Every rule within King Chess is also applicable to Emperor Chess, with the exception of a few things, but we'll get into it later. If you're new to this, or want to have a quick refresh, head to [here](https://www.chessusa.com/chess-rules.html).

So with that in mind, Emperor Chess comes with its own rules, and some of them override those from King Chess. Here's a complete list:
## Stats
- Each chess piece has three kinds of stat:
  - `food`: how far the piece can move
  - `attack point (AP)`: how strong the piece is
  - `influence point (IP)`: how powerful the piece is
- Any pawn that gets promoted will have the same stats.
- Some stats are incremented over time, some can be taken from the opponent's pieces, some can be supplied.

### Food
- `food` determines if the chess piece can move or not. Each move costs one `food`, and you cannot move if you have no `food` left.
- Castling will also cost an amount of `food` equals to the total travel distance for both the king and the rook.
- Taking a piece will transfer all `food` of the fallen piece to the victor.
- `food` is also transferrable between allied pieces. However you can only transfer `food` from piece A to B only if B is within 8 cells adjacent to A.
- `food` can also be supplied by the player. More details [here](#supply).

### Attack Point (AP)
- `AP` determines how strong each piece is. The higher the number, the stronger it is. It is used to weild both `assault` (taking other piece) and `active defense` (blocking other pieces from attacking).
- A chess piece can only take the opponent's piece _if_ it has equal or greater `AP`. You cannot take the opponent's piece if your piece has less `AP`.
- Taking a piece will cause `exhaustion`, which means it will decrease the `AP` of the victor by the amount of `AP` of the fallen piece. For example, if piece A with `AP` of 3 takes down piece B with `AP` of 1, A will be left with 2 `AP`. This lasts for _**3**_ rounds. Consecutive will reset the round counter.
- The rule above is also applied when your piece is moved to a location within the striking distance of a opponent's piece. The opponent cannot take your piece if their piece's `AP` is lower than yours. This is called `active defense` because you don't need to run away like in King Chess.
- Taking a piece with the same `AP` will cause `mutual destruction`, which mean _both_ pieces will be destroyed.
- Both `assault`, `active defense` and `mutual destruction` are also applicable to checks and checkmates. I.e. you cannot take the king if you have less `AP`.

### Influence Point (IP)
- `IP` allows specialisation of a piece. For example, a pawn can specialise in spear, sword or arrow.
- Specialisation is changable, i.e. a pawn can specialise in sword after specialising in spear.
- Specialisation will cost an amount of `IP` and can alter the chess piece's `AP`. More details on specialisation later.
- `IP` is incremented for each piece every _**5**_ turns.

## Turn
A turn is pretty much the same as a King Chess' turn, but there are other actions you can take aside from moving a piece. Here is a list of actions that will cost you a turn, i.e. taking such action will end your turn immediately.

- Moving a piece
- Taking a piece
- Transfering `food` between pieces
- Castling
- Specialising (more on this later in [this section](#specialisation))
- Supplying (more on this later in [this section](#supply))

Any periodic event such as `IP` increments will happen at the beginning of a turn.

## Specialisation
Specialisation enhances a piece at the cost of turns and certain amount of `IP`. Enhancement comes in many forms, some with stats improvement, some with _**special**_ abilities. Specifically:
- **Stats improvement:** Enhancing a piece will increase its `AP` by a certain amount.
- **Special ability:** Enhancing a piece will give it some passive ability such as adjacent piece moral boost (increase `AP`). More details [here](#special-abilities).

There are also rules around specialisation:
- Specialising a piece will forfeit that turn, and specialisation may take a number of turns before it is completed.

## Supply

## Special Abilities
