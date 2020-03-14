In this problem, we add the lambda expression

```
studentList.sort(
            (s1, s2) -> Double.compare(s2.getCgpa(), s1.getCgpa()) == 0
                ? s1.getFname().compareTo(s2.getFname()) == 0
                    ? s1.getId() - s2.getId()
                    : s1.getFname().compareTo(s2.getFname())
                : Double.compare(s2.getCgpa(), s1.getCgpa()));
```
                
and this lets us create a Comparator object in one line that fufills all our requirements.
