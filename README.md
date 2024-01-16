# GCP의 Cloud Build와 Docker, Artifact Repository 예제 Repository

해당 레포는 Java 애플리케이션과 Node.js 애플리케이션의 빌드를 자동화하는 세팅 파일에 대한 예제 코드이다.\

<p>&nbsp;</p>

## Java 애플리케이션을 Cloud Build로 CI를 구성할 수 있는 방법

1. 빌드된 패키지를 Docker 컨테이너화하여 Artifact Registry에 저장
2. MVN 패키지화 후 Artifact Registry에 저장

<p>&nbsp;</p>

## 주의사항
위 두 가지에 대해서 각각 cloudbuild-docker.yaml, cloudbuild-mvn.yaml에 세팅파일의 예제가 담겨있다.

<br>

실제로 yaml파일의 이름은 정확히 cloudbuild.yaml이어야하므로 이를 참고하여 필요한 yaml을 작성한다면 도움이 될 것이다.
<br> 

또는, cloudbuild.yaml을 따로 생성하지 않고, GCP Cloud Build의 "인라인 작성" 방식을 활용하면 된다.

<p>&nbsp;</p>

## 관련 문서
<a href="https://cobinding.tistory.com/238>yaml 파일 관련 팁</a>
<a href="https://cobinding.tistory.com/217>Docker와 GCP Cloud Build & Cloud Run으로 CI/CD 구성하기</a>
