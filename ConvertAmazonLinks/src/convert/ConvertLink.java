//limitado a links não encurtados*
package convert;

import java.net.URI;
public class ConvertLink {
	private String link;
	private static final String myTag = "?tag=barato012-20";
	public ConvertLink(String link) {
		this.link = link;
	}

public String convert()	{
	try {
        URI uri = new URI(link);
        String path = uri.getPath(); // pega o "/dp/idPr0dut0 do link"
        
        if (!path.contains("/dp/")) {
            return "Link inválido / não suportado.";
        }
        String base = uri.getScheme() + "://" + uri.getHost(); //pega a parte do dominio base
        return base + path + myTag;
	} catch (Exception e) {
        return "Erro ao processar o link: " + e.getMessage();
	}
}
public String getLink() { 
	return link; 
	}
public void setLink(String link) { 
	this.link = link; 
	}
}
