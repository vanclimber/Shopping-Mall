package net.suncaper.springboot.domain;

import java.math.BigDecimal;

public class Product {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.id
     *
     * @mbg.generated Fri Aug 02 20:43:39 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.name
     *
     * @mbg.generated Fri Aug 02 20:43:39 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.product_type
     *
     * @mbg.generated Fri Aug 02 20:43:39 CST 2019
     */
    private String productType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.price
     *
     * @mbg.generated Fri Aug 02 20:43:39 CST 2019
     */
    private BigDecimal price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.hot_point
     *
     * @mbg.generated Fri Aug 02 20:43:39 CST 2019
     */
    private BigDecimal hotPoint;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.fileTitle
     *
     * @mbg.generated Fri Aug 02 20:43:39 CST 2019
     */
    private String filetitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.fileLenth
     *
     * @mbg.generated Fri Aug 02 20:43:39 CST 2019
     */
    private Long filelenth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.fileType
     *
     * @mbg.generated Fri Aug 02 20:43:39 CST 2019
     */
    private String filetype;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.id
     *
     * @return the value of product.id
     *
     * @mbg.generated Fri Aug 02 20:43:39 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.id
     *
     * @param id the value for product.id
     *
     * @mbg.generated Fri Aug 02 20:43:39 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.name
     *
     * @return the value of product.name
     *
     * @mbg.generated Fri Aug 02 20:43:39 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.name
     *
     * @param name the value for product.name
     *
     * @mbg.generated Fri Aug 02 20:43:39 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_type
     *
     * @return the value of product.product_type
     *
     * @mbg.generated Fri Aug 02 20:43:39 CST 2019
     */
    public String getProductType() {
        return productType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_type
     *
     * @param productType the value for product.product_type
     *
     * @mbg.generated Fri Aug 02 20:43:39 CST 2019
     */
    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.price
     *
     * @return the value of product.price
     *
     * @mbg.generated Fri Aug 02 20:43:39 CST 2019
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.price
     *
     * @param price the value for product.price
     *
     * @mbg.generated Fri Aug 02 20:43:39 CST 2019
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.hot_point
     *
     * @return the value of product.hot_point
     *
     * @mbg.generated Fri Aug 02 20:43:39 CST 2019
     */
    public BigDecimal getHotPoint() {
        return hotPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.hot_point
     *
     * @param hotPoint the value for product.hot_point
     *
     * @mbg.generated Fri Aug 02 20:43:39 CST 2019
     */
    public void setHotPoint(BigDecimal hotPoint) {
        this.hotPoint = hotPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.fileTitle
     *
     * @return the value of product.fileTitle
     *
     * @mbg.generated Fri Aug 02 20:43:39 CST 2019
     */
    public String getFiletitle() {
        return filetitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.fileTitle
     *
     * @param filetitle the value for product.fileTitle
     *
     * @mbg.generated Fri Aug 02 20:43:39 CST 2019
     */
    public void setFiletitle(String filetitle) {
        this.filetitle = filetitle == null ? null : filetitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.fileLenth
     *
     * @return the value of product.fileLenth
     *
     * @mbg.generated Fri Aug 02 20:43:39 CST 2019
     */
    public Long getFilelenth() {
        return filelenth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.fileLenth
     *
     * @param filelenth the value for product.fileLenth
     *
     * @mbg.generated Fri Aug 02 20:43:39 CST 2019
     */
    public void setFilelenth(Long filelenth) {
        this.filelenth = filelenth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.fileType
     *
     * @return the value of product.fileType
     *
     * @mbg.generated Fri Aug 02 20:43:39 CST 2019
     */
    public String getFiletype() {
        return filetype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.fileType
     *
     * @param filetype the value for product.fileType
     *
     * @mbg.generated Fri Aug 02 20:43:39 CST 2019
     */
    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Fri Aug 02 20:43:39 CST 2019
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Product other = (Product) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getProductType() == null ? other.getProductType() == null : this.getProductType().equals(other.getProductType()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getHotPoint() == null ? other.getHotPoint() == null : this.getHotPoint().equals(other.getHotPoint()))
            && (this.getFiletitle() == null ? other.getFiletitle() == null : this.getFiletitle().equals(other.getFiletitle()))
            && (this.getFilelenth() == null ? other.getFilelenth() == null : this.getFilelenth().equals(other.getFilelenth()))
            && (this.getFiletype() == null ? other.getFiletype() == null : this.getFiletype().equals(other.getFiletype()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Fri Aug 02 20:43:39 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getProductType() == null) ? 0 : getProductType().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getHotPoint() == null) ? 0 : getHotPoint().hashCode());
        result = prime * result + ((getFiletitle() == null) ? 0 : getFiletitle().hashCode());
        result = prime * result + ((getFilelenth() == null) ? 0 : getFilelenth().hashCode());
        result = prime * result + ((getFiletype() == null) ? 0 : getFiletype().hashCode());
        return result;
    }
}