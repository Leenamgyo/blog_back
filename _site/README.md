# 프로젝트

### 깃 
[Publish]: 출판 


<!-- ---
layout: page
title: About
permalink: /about/
---

## Theme Monos
> Simple and lightweight theme for Jekyll

### Features
- Responsive.
- Syntax Highlight
- Most optimized theme for tech blog.
- Lightweight with minimum stylesheet.
- Easy to customize.
- Offers category menu.

### _config.yml
> Code block will look like this.
```yml
highlighter-theme: monokai //you can change your syntax color scheme.
date_format: "%Y-%M-%D" //and date format.
```

### Screenshots
#### Page
![alt text](/public/img/screenshot-1.png)
#### Articles
![alt text](/public/img/screenshot-2.png)
#### Page - Mobile
![alt text](/public/img/screenshot-m1.png)
#### Page - Articles
![alt text](/public/img/screenshot-m2.png) -->

# MarkDown Syntax
## Header 
```
    # h1
    ## h2
    ### h3
    #### h4
    ##### h5
    ###### h6
```

## BlockQuotes
```
    > 인용문
    >> 인용문 내부의 인용문
```

## Code Block
```
    ``` 혹은 ~~~
```
## Emphasis
```
    기울여 쓰기(italic) : * 또는 _로 감싼 텍스트
    굴게쓰기(bold) : ** 또는 __로 감싼 텍스트
```

## Horizontal Rules
```
    - 또는 * 또는 _ 을 3개 이상 작성
```

## Links
### Externals
```
    1. inline Link [Google](http://www.google.co.kr "구글")
    2. reference Link
        [Google][1]
        [Naver][2]
        [1]: http://google.com/ “구글”
        [2]: http://naver.com/ “네이버”
    3. URL Link
        <http://google.com/>
        <example@gmail.com/>
```

### Internal 
```
    [목차](#index)
```

## List
### Ordered List
```
    No. 숫자 다음 .을 찍는다. (적힌 숫자랑 상관없이 순서대로 번호가 매겨진다.)

    1. list item 1
    2. list item 2
    3. list item 3
    4. list item 4
    5. list item 5
```

### Unordered Lists
```
    *, +, - 으로 시작

    * list item 1
        * list item 1-1
            * list item 2-1
        * list item 1-2
```

## Tables

### create
```
    Header 1 | Header 2
--------- | ---------
Content 1 | Content 3
Content 2 | Content 4
```

### sort
```
    | Header 1 | Header 2 | Header 3 |
    | :-------- | :--------: | --------: |
    | Left | Center | Right |
```

## Images

```
    인라인 이미지 ![alt text](/test.png )
    링크 이미지 ![alt text](image_URL)
    참조 이미지
        ![alt text][1]
        [1]: /test.png
```

## Footnotes
```
    각주입니다[^id] 
    [^id]: 각주에 대한 설명.
```

## folding
```
    <details><summary>CLICK ME</summary>
    ```
    pythonprint("hello world!")
    ```
```