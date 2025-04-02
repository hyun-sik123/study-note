# HTML 학습 노트

HTML(HyperText Markup Language)은 웹 페이지를 구성하는 기본적인 마크업 언어입니다. HTML은 다양한 **태그**를 사용하여 웹 페이지의 구조를 정의합니다.

## 1. HTML 기본 구조

HTML 문서는 `<html>`, `<head>`, `<body>` 태그로 구성됩니다.

```html
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>HTML 학습 노트</title>
</head>
<body>
    <h1>HTML 기본 구조</h1>
    <p>이것은 HTML 문서입니다.</p>
</body>
</html>
각 태그의 설명
<!DOCTYPE html>: HTML5 문서임을 선언합니다.

<html>: HTML 문서의 루트 요소입니다.

<head>: 문서의 메타데이터를 포함합니다(예: 문자 인코딩, 제목 등).

<meta>: 문서에 대한 메타 정보를 설정합니다.

<title>: 브라우저 탭에 표시되는 제목을 정의합니다.

<body>: 실제 웹 페이지의 콘텐츠가 들어가는 부분입니다.

```
# 2. HTML 주요 태그
## 2.1 텍스트 관련 태그
```html

<h1> ~ <h6>: 제목 태그 (h1이 가장 큰 제목, h6이 가장 작은 제목)

<p>: 단락을 나타내는 태그

<strong>: 텍스트를 강조 (보통 굵게 표시)

<em>: 텍스트를 기울임꼴로 강조

예시 코드:
html
복사
<h1>이것은 큰 제목입니다.</h1>
<h2>이것은 두 번째로 큰 제목입니다.</h2>
<p>HTML은 웹 페이지를 구성하는 중요한 언어입니다.</p>
<strong>강조된 텍스트</strong>
<em>기울임꼴 텍스트</em>
```
## 2.2 링크와 이미지
```html

<a>: 하이퍼링크를 생성하는 태그

<img>: 이미지를 삽입하는 태그

html
복사
<a href="https://www.example.com">Example 웹사이트</a>
<img src="image.jpg" alt="이미지 설명" width="300">
```

## 2.3 리스트

```html
<ul>: 순서 없는 리스트 (점으로 구분)

<ol>: 순서 있는 리스트 (번호로 구분)

<li>: 리스트 항목

html
복사
<ul>
    <li>첫 번째 항목</li>
    <li>두 번째 항목</li>
</ul>

<ol>
    <li>첫 번째 항목</li>
    <li>두 번째 항목</li>
</ol>
```

## 2.4 테이블
```html
<table>: 테이블을 생성하는 태그

<tr>: 테이블의 행

<td>: 테이블의 데이터 셀

<th>: 테이블의 헤더 셀

html
복사
<table border="1">
    <tr>
        <th>이름</th>
        <th>나이</th>
    </tr>
    <tr>
        <td>홍길동</td>
        <td>25</td>
    </tr>
    <tr>
        <td>이순신</td>
        <td>45</td>
    </tr>
</table>
```

# 3. HTML 폼 요소

```html
HTML 폼을 사용하여 사용자로부터 데이터를 입력받을 수 있습니다.

주요 폼 태그:
<form>: 폼을 생성하는 태그

<input>: 사용자 입력을 받는 폼 요소

<textarea>: 여러 줄의 텍스트 입력을 받는 폼 요소

<button>: 버튼을 생성하는 태그

예시 코드:
html
복사
<form action="/submit" method="POST">
    <label for="username">사용자 이름:</label>
    <input type="text" id="username" name="username" required>
    <br><br>
    <label for="message">메시지:</label>
    <textarea id="message" name="message" rows="4" cols="50" required></textarea>
    <br><br>
    <button type="submit">제출</button>
</form>
```

# 4. HTML5 새로운 기능
```html
HTML5에서는 다양한 새로운 기능들이 추가되었습니다. 그 중 일부는 다음과 같습니다:

새로운 폼 요소: <input type="date">, <input type="email">, <input type="range"> 등

비디오 및 오디오: <video>, <audio> 태그를 사용하여 비디오와 오디오 파일을 삽입할 수 있습니다.

예시 코드:
html
복사
<video width="320" height="240" controls>
    <source src="movie.mp4" type="video/mp4">
    브라우저가 비디오 태그를 지원하지 않습니다.
</video>

<audio controls>
    <source src="audio.mp3" type="audio/mp3">
    브라우저가 오디오 태그를 지원하지 않습니다.
</audio>
```
## 5. 결론
HTML은 웹 페이지를 구조화하는 데 필수적인 언어로, 다양한 태그와 속성을 사용하여 콘텐츠를 정의하고 표시할 수 있습니다. HTML을 잘 이해하면 웹 개발의 기초를 탄탄히 다질 수 있습니다.
