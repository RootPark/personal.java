#include <stdio.h>
int main(){
char answer;
printf("근원이는 바보일까요? (Y or N)");
scanf("%c",&answer);
if(answer == 'y' || answer == 'Y'){
printf("정답입니다.");
}
else printf("본인이군요?");
return 0;
}

