package cn.alenc.birthdaymanagement.vo;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ArticleVO {

    @NotNull(message = "id不能为空")
    private Integer id;

    @NotNull(message =  "articleName不能为空")
    private String articleName;

    @NotBlank(message = "articleType不能为空")
    private String articleType;


    private String author;

    private String createTime;

    private String isDelete;

    public ArticleVO() {
    }

    public ArticleVO(Integer id, String articleName, String articleType, String author, String createTime, String isDelete) {
        this.id = id;
        this.articleName = articleName;
        this.articleType = articleType;
        this.author = author;
        this.createTime = createTime;
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "ArticleVO{" +
                "id=" + id +
                ", articleName='" + articleName + '\'' +
                ", articleType='" + articleType + '\'' +
                ", author='" + author + '\'' +
                ", createTime='" + createTime + '\'' +
                ", isDelete='" + isDelete + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }
}
