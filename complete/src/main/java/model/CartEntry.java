package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Getter @Setter @NoArgsConstructor
public class CartEntry
{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;

	private String name;

	@OneToOne
	private Product product;
}
