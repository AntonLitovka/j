
package main.anton.jenkins.last.build.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class LastBuiltRevision {

    @SerializedName("SHA1")
    @Expose
    private String SHA1;
    @SerializedName("branch")
    @Expose
    @Valid
    private List<Branch__> branch = new ArrayList<Branch__>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public LastBuiltRevision() {
    }

    /**
     * 
     * @param SHA1
     * @param branch
     */
    public LastBuiltRevision(String SHA1, List<Branch__> branch) {
        this.SHA1 = SHA1;
        this.branch = branch;
    }

    /**
     * 
     * @return
     *     The SHA1
     */
    public String getSHA1() {
        return SHA1;
    }

    /**
     * 
     * @param SHA1
     *     The SHA1
     */
    public void setSHA1(String SHA1) {
        this.SHA1 = SHA1;
    }

    /**
     * 
     * @return
     *     The branch
     */
    public List<Branch__> getBranch() {
        return branch;
    }

    /**
     * 
     * @param branch
     *     The branch
     */
    public void setBranch(List<Branch__> branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(SHA1).append(branch).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LastBuiltRevision) == false) {
            return false;
        }
        LastBuiltRevision rhs = ((LastBuiltRevision) other);
        return new EqualsBuilder().append(SHA1, rhs.SHA1).append(branch, rhs.branch).isEquals();
    }

}
