from collections import Counter

l = [1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 4, 4, 4, 4,
     4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 8, 8, 8, 8]

# print(Counter(l))

s = 'aaassssvvvveeeeedddddccccccceeelllll'

# print(Counter(s))

word = 'How many times does each word show up in this sentence word word show up'

words = word.split()

# print(Counter(words))

c = Counter(words)

# print(c.most_common(2))

# print(sum(c.values()))
