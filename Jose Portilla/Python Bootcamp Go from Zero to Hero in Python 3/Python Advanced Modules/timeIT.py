import timeit

'0-1-2-3-....-99'

# print(timeit.timeit(' "-".join(str(n) for n in range(100)) ', number=10000))

print(timeit.timeit('"-".join(map(str, range(100)))', number=1000))

# %timeit "-".join(str(n) for n in range(100))

# %timeit for x in range(100): f(x)
