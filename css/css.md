CSS (Cascading Style Sheets)는 HTML 문서의 스타일을 정의하는 언어입니다. CSS를 사용하면 웹 페이지의 레이아웃, 색상, 글꼴 등을 제어할 수 있습니다. 아래는 CSS 기초에 대한 학습 노트를 GitHub에 바로 사용할 수 있는 마크다운(Markdown) 형식으로 작성한 내용입니다.

markdown
복사
# CSS 기초 학습 노트

CSS는 웹 페이지의 디자인을 담당하는 스타일 시트 언어입니다. HTML로 콘텐츠를 작성하고, CSS로 그 콘텐츠의 스타일을 꾸밀 수 있습니다.

## 1. CSS란 무엇인가?

CSS(Cascading Style Sheets)는 HTML 문서의 스타일을 설정하는 데 사용됩니다. CSS는 **색상**, **글꼴**, **간격**, **배치**, **애니메이션** 등 웹 페이지의 모든 시각적 요소를 제어할 수 있습니다.

## 2. CSS의 적용 방식

CSS는 HTML 문서에 **내부 스타일**, **외부 스타일 시트**, **인라인 스타일**로 적용할 수 있습니다.

### 2.1. 외부 스타일 시트 (External CSS)

외부 스타일 시트를 사용하면 여러 페이지에 걸쳐 일관된 스타일을 적용할 수 있습니다. `link` 태그를 사용하여 HTML 문서에 외부 스타일 시트를 연결합니다.

#### 예시 코드:
```html
<head>
    <link rel="stylesheet" href="styles.css">
</head>
2.2. 내부 스타일 시트 (Internal CSS)
HTML 문서 내 <style> 태그를 사용하여 스타일을 정의할 수 있습니다. 주로 한 페이지에만 스타일을 적용할 때 사용합니다.

예시 코드:
html
복사
<head>
    <style>
        body {
            background-color: lightblue;
        }
        h1 {
            color: navy;
            font-family: Arial, sans-serif;
        }
    </style>
</head>
# 2.3. 인라인 스타일 (Inline CSS)
HTML 태그 내 style 속성을 사용하여 직접 스타일을 지정하는 방법입니다. 하나의 요소에만 스타일을 적용할 때 유용합니다.

예시 코드:
html
복사
<h1 style="color: blue; text-align: center;">CSS 학습 노트</h1>
3. CSS 선택자 (Selectors)
CSS 선택자는 HTML 요소에 스타일을 적용할 대상을 선택합니다. 주요 선택자는 다음과 같습니다:

# 3.1. 기본 선택자
요소 선택자: HTML 요소를 선택하여 스타일을 적용합니다.

css
복사
p {
    color: red;
}
이 코드는 모든 <p> 태그에 빨간색 글씨를 적용합니다.

클래스 선택자: 클래스 속성으로 선택하여 스타일을 적용합니다. 클래스 이름 앞에는 .을 붙입니다.

css
복사
.container {
    width: 100%;
    margin: 0 auto;
}
아이디 선택자: 아이디 속성으로 선택하여 스타일을 적용합니다. 아이디 이름 앞에는 #을 붙입니다.

css
복사
#header {
    background-color: gray;
}
3.2. 복합 선택자
자식 선택자: 특정 부모 요소의 자식 요소에 스타일을 적용합니다.

css
복사
div > p {
    color: green;
}
후손 선택자: 특정 부모 요소의 후손 요소에 스타일을 적용합니다.

css
복사
div p {
    color: green;
}
그룹 선택자: 여러 요소에 동일한 스타일을 적용합니다.

css
복사
h1, h2, h3 {
    font-family: Arial, sans-serif;
}
# 4. CSS 속성
# 4.1. 색상 및 배경
color: 텍스트의 색상을 설정합니다.

background-color: 배경색을 설정합니다.

예시 코드:
css
복사
body {
    background-color: lightgray;
}

h1 {
    color: darkblue;
}
# 4.2. 폰트
font-family: 글꼴을 설정합니다.

font-size: 글꼴 크기를 설정합니다.

font-weight: 글꼴의 굵기를 설정합니다.

예시 코드:
css
복사
p {
    font-family: 'Arial', sans-serif;
    font-size: 16px;
    font-weight: bold;
}
# 4.3. 텍스트 스타일
text-align: 텍스트 정렬을 설정합니다.

line-height: 텍스트 줄 간격을 설정합니다.

text-decoration: 텍스트에 장식을 추가합니다(예: 밑줄, 취소선 등).

예시 코드:
css
복사
h1 {
    text-align: center;
    text-decoration: underline;
}
# 4.4. 박스 모델
박스 모델은 모든 HTML 요소가 사각형 박스로 간주된다는 개념입니다. 이 박스는 네 가지 주요 부분으로 구성됩니다: content, padding, border, margin.

padding: 콘텐츠와 경계선 사이의 공간

border: 요소의 테두리

margin: 요소와 다른 요소 사이의 간격

예시 코드:
css
복사
div {
    width: 300px;
    padding: 20px;
    border: 1px solid black;
    margin: 10px;
}
# 5. CSS 레이아웃
# 5.1. Flexbox
Flexbox는 웹 페이지의 레이아웃을 간단하게 만들 수 있는 CSS3의 기능입니다. 부모 요소에 display: flex를 설정하고 자식 요소들이 유연하게 배치됩니다.

예시 코드:
css
복사
.container {
    display: flex;
    justify-content: space-between;
}

.item {
    width: 30%;
}
# 5.2. Grid
Grid는 2차원 레이아웃을 쉽게 만들 수 있게 해주는 CSS3 기능입니다. display: grid를 사용하여 행과 열로 구성된 레이아웃을 만들 수 있습니다.

예시 코드:
css
복사
.container {
    display: grid;
    grid-template-columns: 1fr 1fr 1fr;
    gap: 20px;
}

.item {
    background-color: lightblue;
}
## 6. 결론
CSS는 웹 페이지의 디자인을 꾸미는 데 중요한 역할을 합니다. 다양한 선택자와 속성을 사용하여 레이아웃과 스타일을 자유롭게 설정할 수 있습니다. CSS를 잘 활용하면 사용자 경험을 향상시키고, 웹 페이지를 보다 직관적이고 아름답게 만들 수 있습니다.
