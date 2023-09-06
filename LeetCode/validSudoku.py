class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        cols = defaultdict(set)
        rows = defaultdict(set)
        squares = defaultdict(set)

        for c in range(9):
            for r in range(9):
                number = board[r][c]
                if number == ".":
                    continue
                if number in cols[c] or number in rows[r] or number in squares[(r // 3, c // 3)]:
                    return False
                cols[c].add(number)
                rows[r].add(number)
                squares[(r // 3, c // 3)].add(number)

        return True
