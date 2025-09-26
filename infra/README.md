# Re-Life Infrastructure

AWS 기반 인프라 관리 및 배포를 위한 Terraform 코드와 관련 문서입니다.

## Prerequisites
- AWS CLI 설치 및 구성
- [Terraform](https://www.terraform.io/downloads.html) 설치

## Structure
- `main.tf`: 주요 리소스 정의
- `variables.tf`: 변수 정의
- `terraform.tfvars`: 변수 값
- `ec2_user_data.tpl`: EC2 초기화 스크립트 템플릿
- `README.md`: 이 파일

## Usage
1. AWS 자격 증명 설정
    * AWS CLI를 통해 자격 증명을 설정합니다.
    * `aws configure` 명령어를 사용하거나 환경 변수를 설정할 수 있습니다.

2. `terraform.tfvars` 파일에서 변수 값 설정
 * `terraform.tfvars.default` 파일을 복사하여 `terraform.tfvars` 파일을 생성한 후, 각 변수에 맞는 값을 입력합니다.
 * 주의
   * 해당 파일은 민감한 정보를 담는 공간으로 사용됩니다.
   * 절대 외부로 유출되지 않도록 주의해주세요.
   * Git 저장소에 커밋하지 마세요.
 
3. 터미널에서 다음 명령어 실행
```terraform
# infra 디렉토리에서 진행

# 초기화 
terraform init

# terraform plan (검토)

# 적용 시 'yes' 입력
terraform apply 

# 리소스 삭제
terraform destroy
```

마지막 수정일: 2025-09-26