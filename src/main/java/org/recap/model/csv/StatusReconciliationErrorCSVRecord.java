package org.recap.model.csv;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

import java.io.Serializable;

/**
 * Created by hemalathas on 5/6/17.
 */
@CsvRecord(generateHeaderColumns = true, separator = ",", quoting = true, crlf = "UNIX", skipFirstLine = true)
public class StatusReconciliationErrorCSVRecord implements Serializable {

    @DataField(pos = 1, columnName = "Barcode")
    private String barcode;

    @DataField(pos = 2, columnName = "Institution")
    private String institution;

    @DataField(pos = 3, columnName = "ImsLocation")
    private String imsLocation;

    @DataField(pos = 4, columnName = "ReasonForFailure")
    private String reasonForFailure;

    /**
     * Gets barcode.
     *
     * @return the barcode
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * Sets barcode.
     *
     * @param barcode the barcode
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    /**
     * Gets institution.
     *
     * @return the institution
     */
    public String getInstitution() {
        return institution;
    }

    /**
     * Sets institution.
     *
     * @param institution the institution
     */
    public void setInstitution(String institution) {
        this.institution = institution;
    }

    /**
     * Gets imsLocation.
     *
     * @return the imsLocation
     */
    public String getImsLocation() {
        return imsLocation;
    }

    /**
     * Sets imsLocation.
     *
     * @param imsLocation the imsLocation
     */
    public void setImsLocation(String imsLocation) {
        this.imsLocation = imsLocation;
    }

    /**
     * Gets reason for failure.
     *
     * @return the reason for failure
     */
    public String getReasonForFailure() {
        return reasonForFailure;
    }

    /**
     * Sets reason for failure.
     *
     * @param reasonForFailure the reason for failure
     */
    public void setReasonForFailure(String reasonForFailure) {
        this.reasonForFailure = reasonForFailure;
    }
}
