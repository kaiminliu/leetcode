https://blog.csdn.net/qq_42266398/article/details/123349431

filename
```
$!velocityTool.camelCaseName(${question.titleSlug})
```
content
```
package leetcode.editor.cn;
${question.content}
public class $!velocityTool.camelCaseName(${question.titleSlug}){
    public static void main(String[] args) {
        Solution solution = new $!velocityTool.camelCaseName(${question.titleSlug})().new Solution();
        
    }

${question.code}
}
```

loginName: liu-min-kai
Custom Template: √

乱码：编辑idea64.exe.vmoptions文件
-Dfile.encoding=utf-8
