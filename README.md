# Emperor Chess

# Rules
Every rule within King Chess is also applicable to Emperor Chess, with the exception of a few things, but we'll get into it later. If you're new to this, or want to have a quick refresh, head to [here](https://www.chessusa.com/chess-rules.html).

So with that in mind, Emperor Chess comes with its own rules, and some of them override those from King Chess. Here's a complete list:
- Each chess piece has three kinds of stat:
  - `food`: how far the piece can move
  - `attack point (AP)`: how strong the piece is
  - `influence point (IP)`: how powerful the piece is
- `food` determines if the chess piece can move or not. Each move costs one `food`, and you cannot move if you have no `food` left.
- Castling will also cost an amount of `food` equals to the total travel distance for both the king and the rook.
- Taking a piece will transfer all `food` of the fallen piece to the victor.
- A chess piece can only take the opponent's piece _if_ it has equal or greater `AP`. You cannot take the opponent's piece if your piece has less `AP`. This is also applied to check, checkmate as well as when you move a piece to a location within the target zone of an opponent's piece.
- Taking a piece with the same `AP` will cause `mutual destruction`, which mean _both_ pieces will be destroyed.
- `IP` allows specialisation of a piece. For example, a pawn can specialise in spear, sword or arrow. Specialisation is changable, i.e. a pawn can move to sword specialisation after taking spear. Specialiation will cost an amount of `IP`. More details on specialisation later.
- Any pawn that gets promoted will have the same stats.