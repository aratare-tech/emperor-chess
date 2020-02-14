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
    - [Attack Range (AR)](#attack-range-ar)
  - [Turn](#turn)
  - [Specialisation](#specialisation)
  - [Supply Line](#supply-line)

# Rules
Every rule within King Chess is also applicable to Emperor Chess, with the exception of a few things, but we'll get into it later. If you're new to this, or want to have a quick refresh, head to [here](https://www.chessusa.com/chess-rules.html).

So with that in mind, Emperor Chess comes with its own rules, and some of them override those from King Chess. Here's a complete list:
## Stats
- Each chess piece has three kinds of stat:
  - `food`: how far the piece can move
  - `attack point (AP)`: how strong the piece is
  - `influence point (IP)`: how powerful the piece is
  - `attack range (AR)`: how far the piece can attack other pieces
- Any pawn that gets promoted will have the same stats.
- Some stats are incremented over time, some can be taken from the opponent's pieces, some can be supplied.

Here a complete list of each piece with its stats:
| Piece | Food | AP | IP |
| ---- | ---- | ---- | ---- |
| Pawn | 1 | 1 | 1 |
| Rook | 2 | 3 | 1 |
| Knight | 3 | 2 | 1 |
| Bishop | 2 | 2 | 3 |
| Queen | 1 | 3 | 3 |
| King | 1 | 1 | 4 |

> **Note:** `AR` is left out on purpose because it is not used often aside from a few specialisation. It's only used for move limit when specialised.

### Food
- `food` determines if the chess piece can move or not. Each move costs 1 `food`, and you cannot move if you have no `food` left.
- Castling will cost 2 `food`.
- Taking a piece will also cost 1 `food`, and transfer all `food` of the fallen piece to the victor.
- `food` is also transferrable between allied pieces. However you can only transfer `food` from piece A to B only if B is within 8 cells adjacent to A.
- `food` can also be supplied by the player. More details [here](#supply-line).

### Attack Point (AP)
- `AP` determines how strong each piece is. The higher the number, the stronger it is. It is used to weild both `assault` (taking other piece) and `active defense` (blocking other pieces from attacking).
- A chess piece can only take the opponent's piece _if_ it has equal or greater `AP`. You cannot take the opponent's piece if your piece has less `AP`.
- Taking a piece will cause `exhaustion`, which means it will decrease the `AP` of the victor by the amount of `AP` of the fallen piece. For example, if piece A with `AP` of 3 takes down piece B with `AP` of 1, A will be left with 2 `AP`. This lasts for _**3**_ rounds. Consecutive attacks will reset the round counter.
- The rule above is also applied when your piece is moved to a location within the striking distance of a opponent's piece. The opponent cannot take your piece if their piece's `AP` is lower than yours. This is called `active defense` because you don't need to run away like in King Chess.
- Taking a piece with the same `AP` will cause `mutual destruction`, which mean _both_ pieces will be destroyed.
- Both `assault`, `active defense` and `mutual destruction` are also applicable to checks and checkmates. I.e. you cannot take the king if you have less `AP`.

### Influence Point (IP)
- `IP` allows specialisation of a piece. For example, a pawn can specialise in sword or arrow.
- Specialisation will cost an amount of `IP` and can alter the chess piece's `AP`. More details on [specialisation here](#specialisation).
- `IP` is incremented for each piece every _**5**_ turns.

### Attack Range (AR)
Pretty much the same as King Chess with the exception that `AR` can be increased or decreased via [specialisation](#specialisation).

## Turn
A turn is pretty much the same as a King Chess' turn, but there are other actions you can take aside from moving a piece. Here is a list of actions that will cost you a turn, i.e. taking such action will end your turn immediately.

- Moving a piece
- Taking a piece
- Transfering `food` between pieces
- Castling
- Specialising (more on this later in [this section](#specialisation))
- Supplying (more on this later in [this section](#supply-line))

Any periodic event such as `IP` increments will happen at the beginning of a turn.

## Specialisation
Specialisation enhances a piece at the cost of a number of `turns` and `IP`. Enhancement comes in two forms: `active` and `passive`. Specifically:
- **Active:** Stats modification is instant and applied at the end of specialisation.
- **Passive:** Stats modification is only applied before certain events, e.g. attacking or being attacks.

There are also rules around specialisation:
- Specialisation is changable, i.e. a pawn can specialise in sword after specialising in arrow.
- Specialisation is repeatable, i.e. once specialised in a certain area you can respecialise in that area. For example, a pawn that respecialises from sword to arrow can go back to sword.
- Once specialised, the piece cannot go back to normal.
- Specialising a piece will forfeit that turn, and specialisation can take a number of turns before it is completed.
- Pieces that are in the middle of specialisation cannot move, but still can be attacked and all attack effects will still take place normally.
- Passive stats modification from specialisation will be applied _before_ events. E.g. queen's `yandere` specialisation will be applied _before_ attacking or being attacked.

Here's a complete list of specialisation for each piece within the game:

<table>
  <tr>
    <td><b>Piece</b></td>
    <td><b>Specialisation</b></td>
    <td><b>Cost</b></td>
    <td><b>Effect</b></td>
    <td><b>Description</b></td>
  </tr>
  <tr>
    <td rowspan="2"><b>Pawn</b></td>
    <td>Sword</td>
    <td>1 <code>IP</code><br>1 <code>turn</code></td>
    <td>+1 <code>AP</code></td>
    <td>Increase <code>AP</code>.</td>
  </tr>
  <tr>
    <td>Arrow</td>
    <td>1 <code>IP</code><br>1 <code>turn</code></td>
    <td>+1 <code>AR</code></td>
    <td>Increase <code>AR</code>.</td>
  </tr>
  <tr>
    <td rowspan="2"><b>Rook</b></td>
    <td>Hitting Like A Truck</td>
    <td>2 <code>IP</code><br>2 <code>turn</code></td>
    <td>+1 <code>AP</code> <br>+1 <code>exhaustion</code></td>
    <td>Increase <code>AP</code> at the cost of more <code>exhaustion</code>.</td>
  </tr>
  <tr>
    <td>Come At Me Bro!</td>
    <td>3 <code>IP</code><br>1 <code>turn</code></td>
    <td>+3 <code>AP</code>, but cannot move</td>
    <td>Increase <code>AP</code> but cannot move from the current location.</td>
  </tr>
  <tr>
    <td rowspan="2"><b>Knight</b></td>
    <td>Time To Walk</td>
    <td>3 <code>IP</code><br>1 <code>turn</code></td>
    <td>-1 <code>AP</code><br>Can attack without moving</td>
    <td>Decrease <code>AP</code> but allow attacking without moving.</td>
  </tr>
  <tr>
    <td>Ferrari</td>
    <td>2 <code>IP</code><br>2 <code>turn</code></td>
    <td>+1 <code>AP</code><br>Restricted move.</td>
    <td>Increase <code>AP</code> but movement becomes restricted. Can only move by <code>long -> short</code> along the "L" line.</td>
  </tr>
  <tr>
    <td rowspan="2"><b>Bishop</b></td>
    <td>Jesus Christ</td>
    <td>1 <code>IP</code><br>3 <code>turn</code></td>
    <td>+1 <code>AP</code><br>4 <code>AR</code></td>
    <td>Increase <code>AP</code> but can only move or attack within 4 diagonal cells.</td>
  </tr>
  <tr>
    <td>F*ck It, I Want Science</td>
    <td>2 <code>IP</code><br>2 <code>turn</code></td>
    <td>-1 <code>AP</code><br>-2 <code>AP</code> to target piece</td>
    <td>Decrease <code>AP</code> but also decrease <code>AP</code> of the target piece. Only applied to <code>assault</code>. Modification to the target piece takes place <em>before</em> the attacks.</td>
  </tr>
  <tr>
    <td rowspan="2"><b>Queen</b></td>
    <td>Tsundere</td>
    <td>3 <code>IP</code><br>3 <code>turn</code></td>
    <td>+2 <code>AP</code><br>+1 <code>food</code> cost</td>
    <td>Increase <code>AP</code> but increase 1 <code>food</code> per move.</td>
  </tr>
  <tr>
    <td>Yandere</td>
    <td>4 <code>IP</code><br>2 <code>turn</code></td>
    <td>+2 <code>AP</code> when attacking<br>-2 <code>AP</code> when being attacked</td>
    <td>Increase <code>AP</code> when attacking other pieces. Decrease <code>AP</code> when being attacked. Modification takes place <em>before</em> attacks.</td>
  </tr>
  <tr>
    <td rowspan="2"><b>King</b></td>
    <td>Harem</td>
    <td>3 <code>IP</code><br>2 <code>turn</code></td>
    <td>-1 <code>AP</code><br>+1 <code>AP</code> to 8 adjacent pieces</td>
    <td>Decrease own <code>AP</code> but increase <code>AP</code> to all pieces within 1 cell distance from the king.</td>
  </tr>
  <tr>
    <td>You're On Your Own</td>
    <td>2 <code>IP</code><br>1 <code>turn</code></td>
    <td>-1 <code>AP</code>, but can move an extra cell</td>
    <td>Decrease <code>AP</code> but can move 2 cells.</td>
  </tr>
</table>


## Supply Line
"Phew!", you exhale with relief. "That must be all of it", you thought. Nah. This is where sh*t gets `R E A L`.

Behind every army is a supply line, because you can't fight a war if you're hungry or have no weapon. And it is no different here in Emperor Chess.

Behind each side on the chess board is a supply line (conceptually). The supply line produces `food`, which can be given to a chess piece per turn. There is no limit of how much `food` you can give, but you can only do it with _one_ chess piece, and it cannot exceed your `food` storage, which is _**30**_.

`food` is produced by `workers`, and each `worker` produce 1 `food` per _**5**_ turns. There are _**5**_ `workers` intially with _**5**_ `food`. Here's the kicker: `workers` can **_leave_**. A worker will leave if your total `IP` drops below a certain threshold. Here's a quick overview:

| IP | Total number of `workers` |
| ---- | ---- |
| 20+ | 5
| 15 - 19 | 4 |
| 10 - 14 | 3 |
| 5 - 9| 2 |
| 0 - 4 | 1 |

Once left, `worker` cannot be regained, _unless_ one of the opponent's `workers` left and you have additional `IP` to convince the `worker`. Once joined, the new `worker` will start producing 1 `food` every interval.

`workers` can also be secretly bought from the enemy for _**3**_ `IP`. Bought `worker` will return to normal after _**3**_ intervals. Buying a `worker` will not make them join your side, rather they will still be working normally. However, instead of `food`, they will produce `poisoned food`, which causes extra move cost. For example, if a piece has 3 `food` and makes a move, if the consumed `food` is `poisoned` the move cost will be _**2**_ instead of _**1**_. Consuming a `poisoned food` when there's only 1 `food` left will cause normal food reduction to 0. Bought `workers` will also stay behind as long as possible, i.e. they won't leave if there's another `worker` to take their place.
