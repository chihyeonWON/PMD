# PMD
Studying PMD(Programming Mistake Detector) in Eclipse

## PMD 개념

PMD(Programming Mistake Detector)는 애플리케이션을 개발할 때의 코딩 표준이나 베스트 프랙티스에 대한 분석 내용을 제공하는 분석 툴이다.   
PMD의 기능으로는 비어 있는 try/catch/finally, switch 문을 추출하는 등의 버그를 발견할 수 있고, 사용하지 않는 지역변수, 매개변수, private 메소드 등을 추출하는 등의 필요없는 코드를 제거할 수 있다.   
   
개발자들이 원하는 룰을 정해서 코드가 룰에 맞게 작성되어 있는지를 체크할 수 있고, https://pmd.github.io/에서 제공하는 공식 룰셋을 사용하거나, 표준프레임워크에서 제공하는 룰셋을 사용할 수도 있다.   
   
## PMD 실습

1. 이클립스 PMD 플러그인

Window -> Preference -> PMD -> Rule Configuration 메뉴를 선택하고 Use global rule management 체크박스를 체크하면 사용 가능한 Active rules이 377개 나온다.
![EclipsePMD](https://user-images.githubusercontent.com/58906858/179895685-11da2e48-54e6-4ee9-9f4d-66751268f0c6.png)

2. 표준프레임워크 PMD 룰셋 적용

표준프레임워크에서 제공해주는 룰셋으로 변경해본다. 다음 주소로 접속하여 egovinspectionrules-3.8.zip을 다운로드한다.   
https://www.egovframe.go.kr/wiki/lib/exe/fetch.php?media=egovframework:dev3.8:imp:egovinspectionrules-3.8.zip
   
Window -> Preference -> PMD -> Rule Configuration 메뉴를 선택하고 Active룰을 모두 삭제한 뒤 다운로드 한 kor.xml 파일을 import 해준다.
   
PMD 결과를 다양한 파일 형식의 리포트를 받을 수 있다. Windows -> Preferences -> PMD -> Reports에서 원하는 파일 형식을 지정한다.
   
앞장에서 실습을 진행했던 프로젝트를 선택하고 마우스 오른쪽 마우스 클릭 후 PMD -> Check Code를 실행하여 PMD를 실행한다.   

PMD -> Generate Reports를 클릭하고 F5를 누르면 reports 폴더가 생기고 안에 html 파일을 web Browser로 열어보면 PMD 리포트 결과가 나온다.   
![PMDreports](https://user-images.githubusercontent.com/58906858/179898366-00ad1f7b-ccaa-42a2-8186-ba0be6e2f070.png)   

이로써 표준프레임워크에서 제공하는 룰을 사용하여 나쁜 냄새가 나는 코드들을 확인하고 수정하는 코드 인스펙션을 수행할 수 있게 되었다.
