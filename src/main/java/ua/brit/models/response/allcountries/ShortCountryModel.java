
package ua.brit.models.response.allcountries;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ShortCountryModel {

    private String name;
    @JsonProperty("alpha2_code")
    private String alpha2Code;
    @JsonProperty("alpha3_code")
    private String alpha3Code;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ShortCountryModel() {
    }

    /**
     * 
     * @param alpha3Code
     * @param name
     * @param alpha2Code
     */
    public ShortCountryModel(String name, String alpha2Code, String alpha3Code) {
        this.name = name;
        this.alpha2Code = alpha2Code;
        this.alpha3Code = alpha3Code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShortCountryModel withName(String name) {
        this.name = name;
        return this;
    }

    public String getAlpha2Code() {
        return alpha2Code;
    }

    public void setAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
    }

    public ShortCountryModel withAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
        return this;
    }

    public String getAlpha3Code() {
        return alpha3Code;
    }

    public void setAlpha3Code(String alpha3Code) {
        this.alpha3Code = alpha3Code;
    }

    public ShortCountryModel withAlpha3Code(String alpha3Code) {
        this.alpha3Code = alpha3Code;
        return this;
    }

    @Override
    public String toString() {
        return "ShortCountryModel{\n" +
                "name='" + name + "\'\n" +
                ", alpha2Code='" + alpha2Code + "\'\n" +
                ", alpha3Code='" + alpha3Code + "\'\n" +
                "}\n";
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(alpha2Code).append(alpha3Code).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ShortCountryModel) == false) {
            return false;
        }
        ShortCountryModel rhs = ((ShortCountryModel) other);
        return new EqualsBuilder().append(name, rhs.name).append(alpha2Code, rhs.alpha2Code).append(alpha3Code, rhs.alpha3Code).isEquals();
    }

}
