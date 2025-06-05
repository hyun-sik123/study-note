# 08. 객체지향 프로그래밍 (OOP)

Python은 객체지향 언어입니다. 클래스를 사용하여 객체를 생성합니다.

```python
class Student:
    def __init__(self, name, major):
        self.name = name
        self.major = major

    def introduce(self):
        print(f"저는 {self.major}를 전공하는 {self.name}입니다.")

s1 = Student("윤서", "컴퓨터공학")
s1.introduce()
```
