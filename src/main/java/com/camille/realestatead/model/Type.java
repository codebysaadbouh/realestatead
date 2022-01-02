package com.camille.realestatead.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "type")
public class Type extends AbstractEntity {

    @Column(name = "libelle")
    private String libelle;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "type")
    private List<Advertisement> type;
}
