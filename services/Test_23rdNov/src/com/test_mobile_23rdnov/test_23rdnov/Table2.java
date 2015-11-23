/*Copyright (c) 2015-2016 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.test_mobile_23rdnov.test_23rdnov;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;




/**
 * Table2 generated by hbm2java
 */
@Entity
@Table(name="`TABLE2`"
    ,schema="Test_23rdNov"
)
public class Table2  implements java.io.Serializable
 {


private Table2Id id;

    public Table2() {
    }



     @EmbeddedId

    

    @AttributeOverrides( {
        @AttributeOverride(name="column2", column=@Column(name="`COLUMN2`", nullable=false) ), 
        @AttributeOverride(name="id", column=@Column(name="`ID`", nullable=false) ) } )
    public Table2Id getId() {
        return this.id;
    }
    
    public void setId(Table2Id id) {
        this.id = id;
    }



public boolean equals(Object o) {
         if (this == o)
         return true;
		 if ( (o == null ) )
		 return false;
		 if ( !(o instanceof Table2) )
		 return false;

		 Table2 that = ( Table2 ) o;

		 return ( (this.getId()==that.getId()) || ( this.getId()!=null && that.getId()!=null && this.getId().equals(that.getId()) ) );

   }

   public int hashCode() {
         int result = 17;

         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );

         return result;
     }


}

