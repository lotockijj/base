package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Getter @Setter @NoArgsConstructor
public class Cart
{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;

	@OneToMany
	private List<CartEntry> cartEntris;
}
